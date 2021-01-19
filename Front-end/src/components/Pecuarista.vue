<template>
  <div>
    <header>
    <ul class="side-nav" id="menu-mobile">
			<li><a class="hide-menu">Olá, Pecuarista!</a></li>
			<li><a class="hide-menu" href="#sobre">Ver Perfil</a></li>
      <li><a class="hide-menu" href="C:\Users\danie\Desktop\Cadastro_Positivo\index.html">Sair</a></li>
		</ul>
      <div class="navbar-fixed">
        <nav class="navbar z-depth-0">
          <div class="nav-wrapper container">
            <h1 class="logo_text">Cadastro Positivo de Pecuaristas</h1>
            <a href=""
              ><img class="logo_img" src="img/logo.png" alt="CadastroPositivo"
            /></a>
            <ul class="right light hide-on-med-and-down ul">
              <li>Olá, Pecuarista!</li>
              <li><a href="#sobre">Ver Perfil</a></li>
              <li>
                <a href="C:\Users\danie\Desktop\Cadastro_Positivo\index.html"
                  >Sair</a
                >
              </li>
            </ul>
            <a href="menu-mobile" data-activates="menu-mobile" class="button-collapse right"><i class="material-icons">menu</i></a>
          </div>
        </nav>
      </div>
    </header>
    <section class="servicos bloco scrollspy" id="servicos">
      <div class="row container">
        <div class="col s12 center">
          <h2 class="light">Cadastro Positivo de Pecuaristas</h2>
          <p class="light">
            O Cadastro Positivo de Pecuaristas analisa se o pecuarista
            está de acordo com as leis ambientais usando os dados cadastrados pelo usuário.<br>
            Selecione uma das opções.
          </p>
        </div>
      </div>
      <div class="row container">
        <article class="col s12 m6 l3">
          <div class="card">
            <div class="card-image">
              <img
                src="img/verificar.jpg"
                alt="Pilates"
                class="materialboxed"
              />
              <a
                href="#pilates-modal"
                class="btn btn-floating halfway-fab blue-logo modal-trigger"
              >
                <i class="material-icons">more_horiz</i>
              </a>
            </div>
            <div class="card-content">
              <h3 class="card-title">Produtor Positivo</h3>
              <p class="light">
                Dentro do CPE se pode verificar se o produtor está positivo ou
                não de acordo com as leis ambientais, gerando um score.
              </p>
              <br />
              <div class="row center btn-horario">
                <a
                  href="#login-modal"
                  class="btn btn-large blue-logo modal-trigger"
                  ><i class="material-icons left"></i> Gerar Score
                </a>
              </div>
            </div>
          </div>
        </article>
        <div class="modal" id="pilates-modal">
          <div class="modal-content">
            <h5 class="light">O que é Pilates?</h5>
            <p class="light black-text">
              O Pilates é um método de exercício físico e alongamento que
              utiliza o peso do próprio corpo na sua execução. É uma técnica de
              reeducação do movimento que visa trabalhar o corpo todo, trazendo
              equilíbrio muscular e mental.
            </p>
            <h5 class="light">Quais os benefícios do Pilates?</h5>
            <ul class="collection">
              <li class="collection-item">
                Alongar, tonificar e definir a musculatura sem exageros;
              </li>
              <li class="collection-item">Melhorar a postura;</li>
              <li class="collection-item">
                Tonificar a musculatura profunda do abdômen;
              </li>
              <li class="collection-item">Prevenir e recuperar lesões;</li>
              <li class="collection-item">
                Reduzir o “stress” e aliviar as tensões;
              </li>
              <li class="collection-item">
                Deixar sua coluna mais forte e flexível;
              </li>
              <li class="collection-item">
                Melhorar a área de movimento das articulações;
              </li>
              <li class="collection-item">Melhora a circulação sanguínea;</li>
              <li class="collection-item">
                Aumentar a coordenação e o equilíbrio;
              </li>
              <li class="collection-item">
                Corrigir sobrecargas e alinhar os músculos;
              </li>
              <li class="collection-item">
                Melhorar a mobilidade e a agilidade;
              </li>
              <li class="collection-item">
                Complementar o seu treino esportivo;
              </li>
              <li class="collection-item">
                Melhorar o visual de seu corpo e a sua auto-estima.
              </li>
            </ul>
          </div>
          <div class="modal-footer">
            <a class="btn blue-logo modal-action modal-close"> Sair </a>
          </div>
        </div>
        <article class="col s12 m6 l3">
          <div class="card">
            <div class="card-image">
              <img
                src="img/certificado.jpg"
                alt="Nutrição"
                class="materialboxed"
              />
              <a
                href="#nutricao-modal"
                class="btn btn-floating halfway-fab blue-logo modal-trigger"
              >
                <i class="material-icons">more_horiz</i>
              </a>
            </div>
            <div class="card-content">
              <h3 class="card-title">Gerar Certificado</h3>
              <p class="light">
                No Cadastro Positivo de Pecuaristas se pode gerar o certificado
                de positividade do Pecuarista
              </p>
              <br />
              <div class="row center btn-horario">
                <a
                  href="#login-modal"
                  class="btn btn-large blue-logo modal-trigger"
                  ><i class="material-icons left"></i> Gerar Certificado
                </a>
              </div>
            </div>
          </div>
        </article>
        <div class="modal" id="nutricao-modal">
          <div class="modal-content">
            <h5 class="light">Qual a importância da nutrição?</h5>
            <p class="light black-text">
              Seja por um estilo de vida saudável ou para eliminar peso, a
              preocupação com os alimentos é constante na rotina das pessoas.
              Por isso é importante saber comer e dar relevância ao que se come.
              Uma nutrição adequada pode prevenir doenças e tornar a vida mais
              saudável.
            </p>
          </div>
          <div class="modal-footer">
            <a class="btn blue-logo modal-action modal-close"> Sair </a>
          </div>
        </div>
        <article class="col s12 m6 l3">
          <div class="card">
            <div class="card-image">
              <img
                src="img/aprovadoreprovado.jpg"
                alt="Fisioterapia"
                class="materialboxed"
              />
              <a class="btn btn-floating halfway-fab blue-logo">
                <i class="material-icons">more_horiz</i>
              </a>
            </div>
            <div class="card-content">
              <h3 class="card-title">Análise do Pecuarista</h3>
              <p class="light">
                Analisar os Pecuaristas de acordo com os dados cadastrados de
                cada perfil para verificar se ele está positivo ou não.
              </p>
              <br />
              <div class="row center btn-horario">
                <a
                  href="#login-modal"
                  class="btn btn-large blue-logo modal-trigger"
                  ><i class="material-icons left"></i> Analisar Pecuarista
                </a>
              </div>
            </div>
          </div>
        </article>
        <article class="col s12 m6 l3">
          <div class="card">
            <div class="card-image">
              <img src="img/dados.jpg" alt="Funcional" class="materialboxed" />
              <a class="btn btn-floating halfway-fab blue-logo">
                <i class="material-icons">more_horiz</i>
              </a>
            </div>
            <div class="card-content">
              <h3 class="card-title">Dados do Produtor</h3>
              <p class="light">
                No CPP é possível verificar os dados do perfil do produtor Rural
                Brasileiro cadastrados por ele na plataforma.
              </p>
              <br />
              <div class="row center btn-horario">
                <a
                  href="#login-modal"
                  class="btn btn-large blue-logo modal-trigger"
                  ><i class="material-icons left"></i> Verificar Dados
                </a>
              </div>
            </div>
          </div>
        </article>
      </div>
      <footer class="rodape">
        <div class="row container center">
          <img src="img/logo.png" class="logo_img" />
          <p class="light green-text">
            © Cadastro Positivo de Pecuaristas - Zetta Lab
          </p>
        </div>
      </footer>
    </section>
  </div>
</template>

<script>
export default {};
</script>


