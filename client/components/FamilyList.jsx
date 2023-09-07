import React, { useState } from 'react';
import {
  Image,
  View,
  Text,
  TouchableWithoutFeedback,
  TouchableOpacity,
} from 'react-native';
import { useRecoilState } from 'recoil';

import { images } from '../constants';
import { selectedUserAtom } from '../recoil/accountBook';
import { dummyUser, dummyUsers } from '../test/dummyData/user';

const FamilyList = props => {
  const [selectedUser, setSelectedUser] = useRecoilState(selectedUserAtom);

  // 선택된 유저는 transition을 통해서 좀 더 크게 표현하기 + 티어 높은 순으로 표현
  const renderUserProfile = user => {
    return (
      <TouchableWithoutFeedback
        key={user.userId}
        onPress={() => {
          setSelectedUser(prev => {
            return user.userId;
          });
        }}>
        <>
          <View>
            <Image source={images.father} />
          </View>
          <View>
            <Text>{user.name}</Text>
          </View>
        </>
      </TouchableWithoutFeedback>
    );
  };

  return <View>{dummyUsers.map(user => renderUserProfile(user))}</View>;
};

export default FamilyList;
