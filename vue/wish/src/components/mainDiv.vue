<template>
    <div id="main">
        <dl  v-drag v-for="(item,index) in list" :key="item.id"  ref="wish">
            <dt>
                <span class="username">{{item.userName}}</span>
                <span class="num">{{item.id}}</span>
            </dt>
            <dd class="content"  v-html="item.content"></dd>
            <dd class="bottom">
                <span class="time">{{item.time|fmTime}}</span>
                <a href="javascript:;" class="close" @click=wishDel(index)></a>
            </dd>
        </dl>
    </div>
    
</template>
<script>
export default {
  data() {
    return {
      paperClass: "paper a1",
      list : []
    };
  },
  mounted() {
    this.wishList();
  },
  updated() {
    console.log("update");
    this.randomWish();
  },

  methods: {
    wishList() {
          this.list = this.$root.$data.list;
    },

    randomWish() {
      var wishs = this.$refs.wish;
      var width = document.documentElement.clientWidth - 235;
      var height =document.documentElement.clientHeight - wishs[0].clientHeight - 176-126;
      for (var i = 0; i < wishs.length; i++) {
        var num=i%4+1;
        this.$refs.wish[i].className="paper a"+num;
        this.$refs.wish[i].style.left = Math.ceil(Math.random() * width) + "px";
        this.$refs.wish[i].style.top = Math.ceil(Math.random() * height) + "px";
      }
    },

    wishDel:function(index){
          this.$root.$data.list.splice(index-1,1);//数组操作
          
    }
    
  },

  directives: {
    drag: function(el) {
      el.onmousedown = function(e) {
        //鼠标按下，计算当前元素距离可视区的距离
        let disX = e.pageX - el.offsetLeft;
        let disY = e.pageY - el.offsetTop;
        var clientWidth = document.documentElement.clientWidth;
        var clientHeight = document.documentElement.clientHeight;
        document.onmousemove = function(e) {
          //通过事件委托，计算移动的距离
          let left = e.pageX - disX;
          let top = e.pageY - disY;
          //移动当前元素
          if (left < 0) {
            left = 0;
          } else if (left > clientWidth - el.clientWidth) {
            left = clientHeight - el.clientWidth;
          }
          if (top < 0) {
            top = 0;
          } else if (top > clientHeight - el.clientHeight - 126) {
            top = clientHeight - el.clientHeight - 126;
          }
          el.style.left = left + "px";
          el.style.top = top + "px";
        };
        document.onmouseup = function() {
          document.onmousemove = document.onmouseup = null;
        };
        return false;
      };
    }
  },

  filters: {
    fmTime: function(time) {
      if (!time) return "";
      var d = new Date();
      d.setTime(time);
      var fillzero = n => (n < 10 ? "0" + n : n);
      //var fillzero = function fillzero(n) {
      //     return n < 10 ? "0" + n : n;
      //};
      var year = d.getFullYear();
      var month = d.getMonth() + 1;
      var date = d.getDate();
      var hh = fillzero(d.getHours());
      var mi = fillzero(d.getMinutes());
      var sec = fillzero(d.getSeconds());
      return `${year}年${month}月${date}日 ${hh}:${mi}:${sec}`;
    }
  }
};
</script>


