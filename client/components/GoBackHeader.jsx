import { Image, Text, TouchableOpacity } from 'react-native';

import { SIZES, icons } from '../constants';

const GoBackHeader = ({ title }) => {
  return (
    <TouchableOpacity
      style={{
        flexDirection: 'row',
        alignItems: 'center',
        marginTop: SIZES.padding * 6,
        paddingHorizontal: SIZES.padding * 2,
      }}>
      <Image
        source={icons.back}
        resizeMode="contain"
        style={{
          width: 20,
          height: 20,
          tintColor: 'black',
        }}
      />

      <Text
        style={{
          marginLeft: SIZES.padding * 1.5,
          color: 'black',
          // ...FONTS.h4,
        }}>
        {title}
      </Text>
    </TouchableOpacity>
  );
};

export default GoBackHeader;
