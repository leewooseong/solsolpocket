import { useState } from 'react';

import FamilyList from '../components/FamilyList';
import GoBackHeader from '../components/GoBackHeader';
import { dummyFamily, dummyUser } from '../test/dummyData/user';

const AccountBook = props => {
  const [selectedUser, setSelectedUser] = useState(dummyUser.userId);

  return (
    <>
      <GoBackHeader title={`${dummyFamily.familyName}이네 가계부`} />
      <FamilyList />
    </>
  );
};

export default AccountBook;
