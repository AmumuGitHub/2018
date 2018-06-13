<template>
  <div class="news">
    <h3>我是news组件</h3>
    <ul>
      <!-- <li><router-link to="/news/detail/001" active-class="news-active">001</router-link></li>
      <li><router-link to="/news/detail/001?a=1&b=2" active-class="news-active">002</router-link></li>
      <li><router-link :to="{name:'detail',params:{aid:1},query:{a:1,b:2}}"  active-class="news-active">003</router-link></li> -->
      
      <li><router-link to="/news/detail/001" active-class="active">001</router-link></li>
      <li><router-link to="/news/detail/001?a=1&b=2" active-class="ctive">002</router-link></li>
      <li><router-link :to="{name:'detail',params:{aid:1},query:{a:1,b:2}}"  active-class="active">003</router-link></li>

      <!-- <li><router-link to="/news/detail/001" :active-class="$style.active">001</router-link></li>
      <li><router-link to="/news/detail/001?a=1&b=2" :active-class="$style.active">002</router-link></li>
      <li><router-link :to="{name:'detail',params:{aid:1},query:{a:1,b:2}}"  :active-class="$style.active">003</router-link></li> -->
      <!-- {{$style.active}} -->
    </ul>
    <router-view></router-view>
    <loading></loading>
  </div>
</template>
<style scoped>
/* 01  终极解决方案   .news-active {} */

/* 02 css模块化 style module   :class="$style.类名"*/

/* 03 应急 style scoped 局域作用域 */

.active{
  background: #939;
}
/* .active{
  background: #939;
} */
</style>

