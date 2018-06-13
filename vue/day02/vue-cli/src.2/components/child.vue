<template>
  <div class="child">
    <h3>我是子组件</h3>
    <buycar></buycar>
  </div>
</template>
<script>
import buycar from './buycar'
export default {
  components:{
    buycar
  }
}
</script>


