import { atom } from 'recoil';

// recoil은 저장소를 atom이라는 단위로 다룬다.
// - useState([]) 유사한 형태의 atom
export const selectedUserAtom = atom({
  key: '',
  default: '',
});
