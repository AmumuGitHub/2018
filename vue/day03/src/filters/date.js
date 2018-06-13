import {fillzero} from './fillzero';
export const date=(time)=>{
  let d=new Date();
  d.setTime(time);
  var year = d.getFullYear();
  var sec = d.getSeconds();
  return `${year}年xx月xx日 hh:mm:${fillzero(sec)}`;
};