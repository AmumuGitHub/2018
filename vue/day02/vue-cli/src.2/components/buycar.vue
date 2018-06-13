<template>
  <div class="container">
      <h4>购物车</h4>
      <dl v-for="(item) of list" :key="item.id">
        <dt>商品名称:
          <span class="badge badge-primary">{{item.name}}</span>
        </dt>
        <dd class="ml-3">单价:
          <span class="badge badge-info">{{item.price | currency('RMB',2)}}</span>
        </dd>
        <dd class="ml-3">数量:
          <input type="number" v-model="item.count" min="0" :max="item.max">
        </dd>
        <dd class="ml-3">小计:
          <span class="badge badge-info">{{ item.price * item.count | currency('$',3) }}</span>
        </dd>
      </dl>
      总价:{{cptSum | currency}}
    </div>
</template>
<script>
export default {
  data() {
    return {
      list: [
        { id: 1, name: "西红柿", price: 4.6, count: 3, max: 4 },
        { id: 2, name: "鸡蛋", price: 2.5, count: 7, max: 3 },
        { id: 3, name: "黄瓜", price: 8.6, count: 1, max: 2 }
      ]
    };
  },
  filters: {
    currency: function(data, currency, digit = 2) {
      currency = currency || "$";
      return currency + data.toFixed(digit);
    }
  },
  computed: {
    cptSum: function() {
      var result = 0;
      this.list.forEach(function(item, index) {
        result += item.price * item.count;
      });
      return result;
    }
  }
};
</script>

