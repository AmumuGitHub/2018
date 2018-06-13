<template>
  <div class="newsList">
    <ul>
      <!-- <li>
        <a href="article_m.html">
          <h2>1.xx</h2>
          <p>oooo</p>
        </a>
      </li> -->
      <li v-for="(item,index) in list" :key="index">
        <router-link :to="'detail/'+item.id+'?dataName='+dataName" tag="a">
          <h2>{{item.id}}.{{item.title}}</h2>
          <p>{{item.detail}}</p>
        </router-link>
      </li>
      
    </ul>
  </div>
</template>
<script>
export default {
  props:['list','dataName']
}
</script>

