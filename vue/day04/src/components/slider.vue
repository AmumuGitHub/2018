<template>
  <!-- <div class="banner">
    <ul class="clearfix">
      <li><img src="src/assets/images/img_1.jpg" alt=""/>
        <div class="text-box">
          <h2>还可以降低首付款健身房11111</h2>
          <p>刘德华11 / 文</p>
        </div>
      </li>
      <li><img src="src/assets/images/img_2.jpg" alt=""/>
        <div class="text-box">
          <h2>还可以降低首付款健身房2222</h2>
          <p>刘德华22 / 文</p>
        </div>
      </li>
      <li><img src="src/assets/images/img_3.jpg" alt=""/>
        <div class="text-box">
          <h2>还可以降低首付款健身房333</h2>
          <p>刘德华33 / 文</p>
        </div>
      </li>
      <li><img src="src/assets/images/img_1.jpg" alt=""/>
        <div class="text-box">
          <h2>还可以降低首付款健身房11111</h2>
          <p>刘德华11 / 文</p>
        </div>
      </li>
    </ul>

  </div> -->
  <swipe :showIndicators="false" class="my-swipe">
    <swipe-item class="slide1">1</swipe-item>
    <swipe-item class="slide2">2</swipe-item>
    <swipe-item class="slide3">3</swipe-item>
  </swipe>
</template>
<script>
import { Swipe, SwipeItem } from 'vue-swipe';
export default {
  components: {
    Swipe,SwipeItem
  }
}
</script>
<style>
@import url('../../node_modules/vue-swipe/dist/vue-swipe.css');
.my-swipe {
  height: 200px;
  color: #fff;
  font-size: 30px;
  text-align: center;
}
.slide1,.slide2,.slide3{line-height: 200px;} 
.slide1 {
  background-color: #0089dc;
  color: #fff;
}
 
.slide2 {
  background-color: #ffd705;
  color: #000;
}
 
.slide3 {
  background-color: #ff2d4b;
  color: #fff;
}
</style>


