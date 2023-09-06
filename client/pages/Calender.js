<<<<<<< HEAD
=======
import { Ionicons } from '@expo/vector-icons';
import dayjs from 'dayjs';
>>>>>>> 65c18af6f778e069f5045379bd314cef3ac929ed
import { useEffect, useRef } from 'react';
import {
  Alert,
  FlatList,
  Image,
  Keyboard,
  KeyboardAvoidingView,
  Platform,
  Pressable,
  StyleSheet,
  Text,
  TouchableOpacity,
  View,
} from 'react-native';
<<<<<<< HEAD
import dayjs from 'dayjs';
import DateTimePickerModal from 'react-native-modal-datetime-picker';
import { Ionicons } from '@expo/vector-icons';

import { runPracticeDayjs } from '../components/practice-dayjs';
=======
import DateTimePickerModal from 'react-native-modal-datetime-picker';

import AddTodoInput from '../components/AddTodoInput';
import CalendarContext from '../components/CalendarContext';
import Margin from '../components/Margin';
import { runPracticeDayjs } from '../components/practice-dayjs';
import { useCalendar } from '../hooks/use-calendar';
import { useTodoList } from '../hooks/use-todo-list';
>>>>>>> 65c18af6f778e069f5045379bd314cef3ac929ed
import {
  getCalendarColumns,
  ITEM_WIDTH,
  statusBarHeight,
  bottomSpace,
} from '../utils/constants/CanlendarUtils';
<<<<<<< HEAD
import { useCalendar } from '../hooks/use-calendar';
import { useTodoList } from '../hooks/use-todo-list';
import CalendarContext from '../components/CalendarContext';
import AddTodoInput from '../components/AddTodoInput';

import Margin from '../components/Margin';

export default function App() {
  const now = dayjs();
=======

export default function App() {
  const now = dayjs();

>>>>>>> 65c18af6f778e069f5045379bd314cef3ac929ed
  const {
    selectedDate,
    setSelectedDate,
    isDatePickerVisible,
    showDatePicker,
    hideDatePicker,
    handleConfirm,
    subtract1Month,
    add1Month,
  } = useCalendar(now);
<<<<<<< HEAD
=======

>>>>>>> 65c18af6f778e069f5045379bd314cef3ac929ed
  const {
    todoList,
    filteredTodoList,
    input,
    setInput,
    toggleTodo,
    removeTodo,
    addTodo,
    resetInput,
  } = useTodoList(selectedDate);

  const columns = getCalendarColumns(selectedDate);

  const flatListRef = useRef(null);

  const onPressLeftArrow = subtract1Month;
  const onPressHeaderDate = showDatePicker;
  const onPressRightArrow = add1Month;
  const onPressDate = setSelectedDate;

  const ListHeaderComponent = () => (
    <View>
      <CalendarContext
        todoList={todoList}
        columns={columns}
        selectedDate={selectedDate}
        onPressLeftArrow={onPressLeftArrow}
        onPressHeaderDate={onPressHeaderDate}
        onPressRightArrow={onPressRightArrow}
        onPressDate={onPressDate}
      />
      <Margin height={15} />

      <View
        style={{
          width: 20,
          height: 4,
          borderRadius: 4 / 2,
          backgroundColor: '#a3a3a3',
          alignSelf: 'center',
        }}
      />
      <Margin height={15} />
    </View>
  );
<<<<<<< HEAD
=======

>>>>>>> 65c18af6f778e069f5045379bd314cef3ac929ed
  const renderItem = ({ item: todo }) => {
    const isSuccess = todo.isSuccess;
    const onPress = () => toggleTodo(todo.id);
    const onLongPress = () => {
      Alert.alert('삭제하시겠어요?', '', [
        {
          style: 'cancel',
          text: '아니요',
        },
        {
          text: '네',
          onPress: () => removeTodo(todo.id),
        },
      ]);
    };
<<<<<<< HEAD
=======

>>>>>>> 65c18af6f778e069f5045379bd314cef3ac929ed
    return (
      <Pressable
        onPress={onPress}
        onLongPress={onLongPress}
        style={{
          flexDirection: 'row',
          width: ITEM_WIDTH,
          alignSelf: 'center',
          paddingVertical: 10,
          paddingHorizontal: 5,
          borderBottomWidth: 0.2,
          borderColor: '#a6a6a6',
          // backgroundColor: todo.id % 2 === 0 ? "pink" : "lightblue",
        }}>
        <Text style={{ flex: 1, fontSize: 14, color: '#595959' }}>
          {todo.content}
        </Text>

        <Ionicons
          name="ios-checkmark"
          size={17}
          color={isSuccess ? '#595959' : '#bfbfbf'}
        />
      </Pressable>
    );
  };
<<<<<<< HEAD
=======

>>>>>>> 65c18af6f778e069f5045379bd314cef3ac929ed
  const scrollToEnd = () => {
    // eslint-disable-next-line no-undef
    setTimeout(() => {
      flatListRef.current?.scrollToEnd({ animated: true });
    }, 300);
  };
<<<<<<< HEAD
=======

>>>>>>> 65c18af6f778e069f5045379bd314cef3ac929ed
  const onPressAdd = () => {
    addTodo();
    resetInput();
    scrollToEnd();
  };
<<<<<<< HEAD
=======

>>>>>>> 65c18af6f778e069f5045379bd314cef3ac929ed
  const onSubmitEditing = () => {
    addTodo();
    resetInput();
    scrollToEnd();
  };
<<<<<<< HEAD
=======

>>>>>>> 65c18af6f778e069f5045379bd314cef3ac929ed
  const onFocus = () => {
    scrollToEnd();
  };

  useEffect(() => {
    runPracticeDayjs();
  }, []);

  return (
    <Pressable
      style={styles.container}
      // onPress={() => Keyboard.dismiss()}
      onPress={Keyboard.dismiss}>
      {/* <TouchableOpacity activeOpacity={1}>

      </TouchableOpacity> */}

      <KeyboardAvoidingView
        behavior={Platform.OS === 'ios' ? 'padding' : 'height'}>
        <>
          <FlatList
            ref={flatListRef}
            data={filteredTodoList}
            style={{ flex: 1 }}
            contentContainerStyle={{
              paddingTop: statusBarHeight + 30,
            }}
            ListHeaderComponent={ListHeaderComponent}
            renderItem={renderItem}
            showsVerticalScrollIndicator={false}
          />

          <AddTodoInput
            value={input}
            onChangeText={setInput}
            placeholder={`${dayjs(selectedDate).format(
              'MM.D',
            )}에 추가할 MONEYQUEST!`}
            onPressAdd={onPressAdd}
            onSubmitEditing={onSubmitEditing}
            onFocus={onFocus}
          />
        </>
      </KeyboardAvoidingView>

      <Margin height={bottomSpace} />

      <DateTimePickerModal
        isVisible={isDatePickerVisible}
        mode="date"
        onConfirm={handleConfirm}
        onCancel={hideDatePicker}
      />
    </Pressable>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
