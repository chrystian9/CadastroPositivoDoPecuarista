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
                    <h1 class="logo_text"> Cadastro Positivo de Pecuaristas </h1>
                    <a href=""><img class="logo_img" src="img/logo.png" alt="CadastroPositivo"></a>
                    <ul class="right light hide-on-med-and-down ul">
                        <li><a style="color:#673a01" class="brownIcon">Olá, Frigorífico!</a></li>
                        <li><a style="color:#673a01" href="#sobre">Ver Perfil</a></li>
                        <li><a style="color:#673a01" href="C:\Users\danie\Desktop\Cadastro_Positivo\index.html">Sair</a></li>
                    </ul>
                    <a href="#menu-mobile" data-activates="menu-mobile" class="button-collapse right"><i class="material-icons">menu</i></a>
                </div>
            </nav>
        </div>
    </header>
    <section class="servicos bloco scrollspy" id="servicos">
     <div class="row container">
      <div class="col s12 center">
       <h2 class="light">Cadastro Positivo de Pecuaristas</h2>
       <p class="light">
        Para oferecer serviços de acordo com a realidade e necessidade de cada região do Brasil, o Cadastro Positivo de Pecuaristas pode fazer consultas de acordo com o usuário logado. Selecione uma das opções!
    </p>
</div>	
</div>
<div class="row container">
  <article class="col s12 m6 l6">
   <div class="card">
    <div class="card-image">   
        <img src="img/score.jpg" alt="Pilates" class="materialboxed">
        <a href="#pilates-modal" class="btn btn-floating halfway-fab brown modal-trigger">
          <i class="material-icons">info</i>
      </a>    								
  </div>
  <div class="card-content">
   <h3 class="card-title"> Score do Pecuarista </h3>
   <p class="light"> Dentro do CPP o frigorífico pode verificar se o produtor está ou não de acordo com as leis ambientais analisando o seu score. </p> <br>
   <div class="row center btn-horario">
    <a href="#login-modal" class="btn btn-large brown modal-trigger"><i class="material-icons left"></i> Analisar Score </a>
</div>
</div>
</div>
</article>
<div class="modal" id="pilates-modal">
  <div class="modal-content">
    <h5 class="light">Produtor Positivo</h5>
    <p class="light black-text">
      No Cadastro Positivo o pecuarista pode gerar um Score para saber se ele está positivo ou não.
  </p>
  <h5 class="light">O Score é calculado de acordo com os seguintes aspectos:</h5>
  <ul class="collection">
      <li class="collection-item">
        Número do Car;
    </li>
    <li class="collection-item">Outorga da água;</li>
    <li class="collection-item">
        Descarte de Resíduos Sólidos;
    </li>
    <li class="collection-item">Licenciamento Ambiental;</li>
    <li class="collection-item">
        Cadastro no IBAMA;
    </li>
</ul>
</div>
<div class="modal-footer">
    <a class="btn brown modal-action modal-close"> Sair </a>
</div>
</div>
<article class="col s12 m6 l6">
 <div class="card">
    <div class="card-image">
       <img src="img/lista.png" alt="Nutrição" class="materialboxed">
       <a href="#nutricao-modal" class="btn btn-floating halfway-fab brown modal-trigger">
          <i class="material-icons">info</i>
      </a>    				
  </div>
  <div class="card-content">
   <h3 class="card-title"> Lista de Pecuaristas</h3>
   <p class="light"> No CPP é possível pelo frigorífico ter a lista de pecuaristas cadastrados e seus respectivos contatos.</p><br>
   <div class="row center btn-horario">
    <a href="#login-modal" class="btn btn-large brown modal-trigger"><i class="material-icons left"></i> Listar Pecuaristas </a>
</div>
</div>
</div>
</article>
    </div>
    <footer class="rodape">
  <div style="margin-left: 60px;" class="row container center">
    <img src="img/whitelogo.png" class="logo_img">
    <p class="light white-text">© Cadastro Positivo de Pecuaristas - Zetta Lab </p>
  </div>        
</footer>
</section>
</div>
</template>

<script>
export default {};
</script>