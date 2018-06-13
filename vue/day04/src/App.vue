<template>
  <div id="app">
    <loading v-show="getLoading"></loading>
    <navbar v-if="getNav"></navbar>
    <transition
      enter-active-class="animated fadeIn"
    >
      <router-view></router-view>
    </transition>
    <footbar v-show="getFoot"></footbar>
  </div>
</template>

<script>
import navbar from "./components/navbar";
import footbar from "./components/footbar";
import { mapGetters } from "vuex";
export default {
  name: "app",
  components: {
    navbar,
    footbar
  },
  methods: {
    conNav(path) {
      if (/home|follow|column/.test(path)) {
        this.$store.dispatch("showNav");
        this.$store.dispatch("showFoot");
      }
      if (/detail|login|reg/.test(path)) {
        this.$store.dispatch("hideNav");
        this.$store.dispatch("hideFoot");
      }
      if (/user/.test(path)) {
        this.$store.dispatch("hideNav");
        this.$store.dispatch("showFoot");
      }
    }
  },
  computed: mapGetters(["getNav", "getFoot","getLoading"]),
  mounted() {
    // console.log("mounted");
    var path = this.$route.path;
    this.conNav(path)
  },
  watch: {
    $route(to) {
      console.log(to.path);
      var path = to.path;
     this.conNav(path)
    }
  }
};
</script>

<style>
/* 02 copy base.css 代码 */
/* 02-A  @import url(); */
</style>
