//es5 输入
// let modA = require('./mod/a.js');

//es6 输入
import {str} from './mod/a.js';

//es 6 输入

require('./css/a.css')

// console.log(modA);
var oDiv=document.getElementById('app');
// oDiv.innerHTML=modA.str;//es 5
oDiv.innerHTML=str;//es6
