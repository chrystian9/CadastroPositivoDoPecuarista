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
            <a
              href="#menu-mobile"
              data-activates="menu-mobile"
              class="button-collapse right"
              ><i class="material-icons">menu</i></a
            >
          </div>
        </nav>
      </div>
    </header>
    <section class="servicos bloco scrollspy" id="servicos">
      <div class="row container">
        <div class="col s12 center">
          <h2 class="light">Score do Pecuarista</h2>
          <p class="light">
            Aqui você poderá verificar o Score do pecuarista de acordo com os
            documentos que ele possui.
          </p>
          <h4 style="color: #673a01">Score Final: 700</h4>
          <chartjs-doughnut v-bind:labels="labels"
          v-bind:datasets="datasets"
          v-bind:option="option" class="grafico"></chartjs-doughnut>
        </div>
      </div>
      <div class="row container">
        <article class="col s12"></article>
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
export default{
    data(){
        return{
            labels: ["Car","Certificado do Ibama", "Outorga da água","Certificado de Regularidade", "Comprovante de Descarte de Embalgens"],
            datasets: [
                {
                    data:[400, 300, 0, 0, 0],
                    backgroundColor: ["Green", "Yellow", "Red", "Blue", "Orange"]
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
    }
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