<div id="top"></div>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->

<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->


<!-- PROJECT LOGO -->
<br />
<div align="center">

[//]: # (  <a href="https://github.com/kimdonghyeon3/SpringBoot_bashboard">)

[//]: # (    <img src="./logo.png" alt="Logo" width="80" height="80">)

[//]: # (  </a>)

<h3 align="center">JWT</h3>

  <p align="center">
    인증에 대한 이해 Session, Cookie, JWT는 뭐야?
    <br />

[//]: # (    <a href="https://github.com/kimdonghyeon3/SpringBoot_bashboard"><strong>View Demo »</strong></a>)

[//]: # (    <br />)

[//]: # (    <br />)

  </p>
</div>


<!-- ABOUT THE PROJECT -->
## JWT
JWT에 대해 알아보게된 이유는 간단했다. 기본적으로 Web을 하다보면 로그인 기능을 누구나 구현을 해보 았을 것이다.
그런데 우리가 활용하는 it는 web이 전부가 아니다. Android, IOS, 응용프로그램 등 정말 다양한 곳에서 로그인 기능이 사용되기도 한다.
그러면 Web을 사용하지 않으면 Cookie를 사용하지 못하는데, 어떻게 로그인과 같인 인증, 인가과정을 거쳐야 될까? 라는 의문이 들었다.
물론 Filter와 인터셉터와 같이 사전에 검증을 할 수 있지만 Session을 사용하지 못하니 도대체 클라이언트가 누구인지를 알 길이 없어지게 된다.

이러한 의문점을 생각하다보니 JWT에 대해 도달하게 되었다. JWT에 대해서 이해해보고, 간략히 사용해보는 학습을 해보자



<p align="right">(<a href="#top">back to top</a>)</p>

[//]: # (### Built With)

[//]: # (<img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"> <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white"> <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"> <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/JSON-000000?style=for-the-badge&logo=JSON&logoColor=61DAFB">)

[//]: # ( <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> <img src="https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white"> <img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white"> <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">)

[//]: # (<p align="right">&#40;<a href="#top">back to top</a>&#41;</p>)

<!-- GETTING STARTED -->
## Getting Started

### 설치 방법

1. Clone the repo
   ```sh
   git clone https://github.com/kimdonghyeon3/Spring_JWT
   ```

2. Start
   ```sh
   start
   ```
   
POSTMAN을 활용하여 예제 TEST를 추천합니다.
(또는 test MockMvc를 활용해 봅시다.)

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->

[//]: # (## Usage)

[//]: # ()
[//]: # (회원가입을 통해 회원을 생성 후 원하는 질문을 등록하면된다.)

[//]: # ()
[//]: # (<p align="right">&#40;<a href="#top">back to top</a>&#41;</p>)

<!-- DEMO EXAMPLES -->

[//]: # (## Demo)

[//]: # (![img]&#40;./demo1.png&#41;)

[//]: # (![img]&#40;./demo2.png&#41;)

[//]: # (![img]&#40;./demo3.png&#41;)

[//]: # ()
[//]: # ()
[//]: # (<p align="right">&#40;<a href="#top">back to top</a>&#41;</p>)

<!-- CONTACT -->
## Contact

Email - kimdonghyeon98@gmail.com

Project Link: [https://github.com/kimdonghyeon3/Spring_JWT](https://github.com/kimdonghyeon3/Spring_JWT)

<p align="right">(<a href="#top">back to top</a>)</p>

MIT License
Copyright (c) 2021 Othneil Drew

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/github_username/repo_name.svg?style=for-the-badge
[contributors-url]: https://github.com/github_username/repo_name/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/github_username/repo_name.svg?style=for-the-badge
[forks-url]: https://github.com/github_username/repo_name/network/members
[stars-shield]: https://img.shields.io/github/stars/github_username/repo_name.svg?style=for-the-badge
[stars-url]: https://github.com/github_username/repo_name/stargazers
[issues-shield]: https://img.shields.io/github/issues/github_username/repo_name.svg?style=for-the-badge
[issues-url]: https://github.com/github_username/repo_name/issues
[license-shield]: https://img.shields.io/github/license/github_username/repo_name.svg?style=for-the-badge
[license-url]: https://github.com/github_username/repo_name/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/linkedin_username
[product-screenshot]: images/screenshot.png
