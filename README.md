

<h3 align="center">
  IsiLanguage
</h3>

<p align="center">

<a href="https://github.com/ViniciussSantos/compilador-isilanguage/commits/main">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/ViniciussSantos/compilador-isilanguage">
  </a>

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/ViniciussSantos/compilador-isilanguage">

  <img alt="GitHub" src="https://img.shields.io/github/license/ViniciussSantos/compilador-isilanguage">
</p>

<p align="center">
  <a href="#sobre-o-projeto">Sobre o projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#requisitos-e-funcionalidades">requisitos e funcionalidades</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
   <a href="#instalando">Instalando</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#licença">Licença</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;  
  <a href="#colaboradores">colaboradores</a>&nbsp;&nbsp;&nbsp;
</p>

##  Sobre o projeto

<p >O projeto é uma implementação do compilador da linguagem isiLanguage utilizando ANTLR4 e Java para a matéria de compiladores na UFABC</p>

##  Tecnologias

- [Java 18](https://www.java.com/pt-BR/)
- [ANTLR](https://www.antlr.org/)

## Requisitos e funcionalidades

Os requisitos mínimos para o compilador:
Item | Feito
:------------ | :-------------|
Possuir 2 tipos de dados (pelo menos 1 String) | :heavy_check_mark:
Possuir a instrução de decisão (if/else) | :heavy_check_mark:
Pelo menos 1 estrutura de repetição | :heavy_check_mark:
Verificar Atribuições com compatibilidade de tipos (semântica) | :heavy_check_mark:
Possuir operações de Entrada e Saída | :heavy_check_mark:
Verificar declaração de variávies (não usar variáveis que não foram declaradas) | :heavy_check_mark:
Verificar se há variáveis declaradas e não-utilizadas (warning) | :heavy_check_mark:
Geração de pelo menos 1 linguagem destino (C/Java/Python) |<ul><li>[] Java</li> <li>[] C</li></ul><li>[] Python</li></ul>

Os elementos adicionais para o compilador:
Item | Feito
:------------ | :-------------|
Nova instrução para Switch/Case (escolha/caso) |
Mais tipos de dados | :heavy_check_mark:
Inclusão de novos operadores (exponenciação, raiz quadrada, logaritmos) |
Geração de código para mais de uma linguagem diferente (semântica) |

Os elementos extraordinários para o compilador:
Item | Feito
:------------ | :-------------|
Criar um interpretador a partir da AST |
Criar um editor com Highlights de palavras reservadas (editor Desktop) |
Criar um editor Web para o código |
Tornar o compilador um Webservice para receber programas e enviar respostas de possíveis erros |

## Instalando
**baixe o [.jar completo do ANTLR](https://www.antlr.org/download.html), [configure a sua IDE](https://github.com/antlr/antlr4/blob/master/doc/java-target.md) e rode o seguinte comando para verificar se tudo está funcionando**
```bash
java -cp .:antlr-4.10.1-complete.jar org.antlr.v4.Tool IsiLang.g4 -package isilanguage.src.parser -o ./isilanguage/src/parser
```
##  Licença

Este projeto está licenciado sobre a licença MIT - Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

##  Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/marinhomateus">
        <img src="https://github.com/marinhomateus.png" width="100px;"/><br>
        <sub>
          <b>Mateus Marinho</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/FusiDaniel">
        <img src="https://github.com/FusiDaniel.png" width="100px;"/><br>
        <sub>
          <b> Daniel Fusimoto Pires </b>
        </sub>
      </a>
    </td>      
      <td align="center">
      <a href="https://github.com/RenanLorijola">
        <img src="https://github.com/RenanLorijola.png" width="100px;"/><br>
        <sub>
          <b>Renan Zago Lorijola </b>
        </sub>
      </a>
    </td> 
      <td align="center">
      <a href="https://github.com/joaoarruda2297">
        <img src="https://github.com/joaoarruda2297.png" width="100px;"/><br>
        <sub>
          <b>João Arruda</b>
        </sub>
      </a>
    </td> 
      <td align="center">
      <a href="https://github.com/ViniciussSantos">
        <img src="https://github.com/ViniciussSantos.png" width="100px;"/><br>
        <sub>
          <b>Vinicius Santos </b>
        </sub>
      </a>
    </td> 
        </td> 
</table>
