<template>
  <div class="administrador">
    <header>
      <ul class="side-nav" id="menu-mobile">
        <li><a class="hide-menu">Olá, Administrador!</a></li>
        <li><a class="hide-menu">Ver Perfil</a></li>
        <li><a class="hide-menu" href="">Sair</a></li>
      </ul>
      <div class="navbar-fixed">
        <nav class="navbar z-depth-0">
         <div class="nav-wrapper container">
          <h1 class="logo_text"> Cadastro Positivo de Pecuaristas </h1>
          <a href=""><img class="logo_img" src="img/logo.png" alt="CadastroPositivo"></a>
          <ul class="right light hide-on-med-and-down ul">
            <li><a>Olá, Administrador!</a></li>
            <li><a href="#sobre">Ver Perfil</a></li>
            <li><a href="C:\Users\danie\Desktop\Cadastro_Positivo\index.html">Sair</a></li>
          </ul>
          <a href="#menu-mobile" data-activates="menu-mobile" class="button-collapse right"><i class="material-icons blue-logo">menu</i></a>
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
      <img src="img/aprovadoreprovado.jpg" alt="Pilates" class="materialboxed">
      <a href="#pilates-modal" class="btn btn-floating halfway-fab blue-logo modal-trigger">
        <i class="material-icons">info</i>
      </a>                    
    </div>
    <div class="card-content">
     <h3 class="card-title"> Aprovar Frigorífico </h3>
     <p class="light">No Cadastro Positivo o Administrador poderá aprovar ou não frigoríficos para verificar se eles são verdadeiros ou não. </p> <br>
     <div class="row center btn-horario">
      <a href="#login-modal" class="btn btn-large blue-logo modal-trigger"><i class="material-icons left"></i> Analisar Frigorífico </a>
    </div>
    </div>
   </div>
</article>
<div class="modal" id="pilates-modal">
 <div class="modal-content"> 
 </div>
 <div class="modal-footer">
  <a class="btn blue-logo modal-action modal-close"> Sair </a>
</div>
</div>
<article class="col s12 m6 l6">
 <div class="card">
  <div class="card-image">
   <img src="img/dados.png" alt="Nutrição" class="materialboxed">
   <a href="#nutricao-modal" class="btn btn-floating halfway-fab blue-logo modal-trigger">
    <i class="material-icons">info</i>
  </a>            
</div>
<div class="card-content">
 <h3 class="card-title"> Lista de Pecuaristas</h3>
 <p class="light"> No CPP é possível pelo administrador ter a lista de pecuaristas cadastrados e seus respectivos contatos.</p><br>
 <div class="row center btn-horario">
  <a href="#login-modal" class="btn btn-large blue-logo modal-trigger"><i class="material-icons left"></i> Listar Pecuaristas </a>
  </div>
</div>
</div>
</article>
</div>
<footer class="rodape" >
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