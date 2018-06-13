<template>
  <list :list="list" :dataName="'follow'"></list>
</template>
<script>
import list from './list.vue'
export default {
  data(){
    return{
      list:[]
    }
  },
  components:{
    list
  },
  mounted(){
    this.$http({
      url:'/data/follow.data',
    }).then(
      res => this.list=res.data
    )
  }
}
</script>

<style>

@import url('../assets/css/index.css');

.newsList{clear: both;margin-bottom:1rem;margin-top:.7rem;}

</style>

