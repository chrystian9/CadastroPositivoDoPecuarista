<template>
  <div>
    <div><h1>Get valores</h1></div>

    <button @click="getValore">get valores para o grafico</button>
    {{ valores }}

    <div></div>
    valores do grafico{{ valores }}
  </div>
</template>
<script>
export default {
  mounted() {
    this.api();
    this.getValore();
  },
  data() {
    return {
      // valores pro grafico
      valores: [],
      // dados de um unico pecuarista
      dados: [],
    };
  },
  methods: {
    api() {
      // DUMMY DATA do api
      const dado  = await axios.get('https://cpp-api.herokuapp.com/buscaCadastoPositivo').then(res => {
        console.log(dado)
        console.log(dado.data)
        this.responseGetAPI = dado.data.message
        console.log(dado.data.message)
        });
      this.dados.push(dado);
    },
    // maneira burra de pegar valores exatos de uma api
    getValore() {
      for (let j = 0; j < 5; j++) {
        const v = this.dados[0].documentoDtos[j].valor;
        this.valores.push(v);
        console.log(v);
      }
    },
  },
};
</script>
<style lang="scss" scoped>
</style>