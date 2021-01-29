<template>
  <div class="frigorifco">
    <header>
      <ul class="side-nav" id="menu-mobile">
        <li><a class="hide-menu">Olá, Pecuarista!</a></li>
        <li><a class="hide-menu">Ver Perfil</a></li>
        <li><a class="hide-menu" href="">Sair</a></li>
      </ul>
      <div class="navbar-fixed">
        <nav class="navbar z-depth-0">
          <div class="nav-wrapper container">
            <h1 class="logo_text">Cadastro Positivo de Pecuaristas</h1>
            <a href=""
              ><img class="logo_img" src="img/logo.png" alt="CadastroPositivo"
            /></a>
            <ul class="right light hide-on-med-and-down ul">
              <li><a>Olá, Pecuarista!</a></li>
              <li><a href="/pecuarista">Home</a></li>
              <li><a href="#sobre">Ver Perfil</a></li>
              <li>
                <a href="/"
                  >Sair</a
                >
              </li>
            </ul>
            <a href="#menu-mobile" data-activates="menu-mobile" class="button-collapse right">
            <i class="material-icons greenIcon">menu</i>
            </a>
          </div>
        </nav>
      </div>
    </header>
    <section class="servicos bloco scrollspy" id="servicos">
      <div class="row container">
        <div class="col s12 center">
          <h2 class="light">Score do Pecuarista</h2>
          <p class="light">
            Aqui você poderá verificar o seu Score de acordo com o status
             dos documentos que você cadastrou em nossa plataforma.
          </p>
          <h4 style="color: #673a01">Score Final: {{score}}</h4>
          <p class="bold">
            Clique 
            nos botões abaixo para identificar os documentos que levaram a essa pontuação:
          </p>
          <chartjs-doughnut v-bind:labels="labels"
          v-bind:datasets="datasets"
          v-bind:option="option" class="grafico"></chartjs-doughnut>
        </div>
      </div>
      <div class="row center btn-horario">
        <a href="#login-modal" class="btn btn-large blue-logo modal-trigger"
          ><i class="material-icons left"></i> Solicitar auxílio para melhorar o seu score
        </a>
      </div>
      <footer class="rodape">
        <div style="margin-left: 60px" class="row container center">
          <img src="img/whitelogo.png" class="logo_img" />
          <p class="light white-text">
            © Cadastro Positivo de Pecuaristas - Zetta Lab
          </p>
        </div>
      </footer>
    </section>
  </div>

</template>
<script>
import axios from "axios";
export default {
  mounted() {
    this.api();
  },
  data() {
    return {
      dados: [],
      score: 0,
      labels: ["Car","Descarte de Resíduos Sólidos", "Licenciamento Ambiental","Outorga da água", "Certificado de Regularidade do Ibama"],
            datasets: [
                {
                    data:[],
                    backgroundColor: ["Green", "Red", "Yellow", "Blue", "Orange"]
                }
            ],
            option: {
                title: {
                    display: true,
                    position: "bottom",
                    text: "Score do Pecuarista"
                }
            }
    };
  },
  methods: {
    async api() {
      // DUMMY DATA do api
      await axios
        .post("https://cpp-api.herokuapp.com/buscaCadastroPositivo", { id: 11})
        .then((res) => {
          this.score = res.data.score;
          for (let j = 0; j < 5; j++) {
            const x = res.data.documentoDtos[j].valor;
            console.log(res.data.documentoDtos[j].valor);

            this.datasets[0].data.push(x);
          }
          this.dados.push(res.data);
        });
    },
  },
};
</script>
<style scoped>
.grafico{
    margin-left: 10%;
    align-content: center;
    height: 80%;
    width: 80%;
}
</style>