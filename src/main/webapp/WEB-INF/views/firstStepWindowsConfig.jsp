<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="header.jsp"/>
<%--
  Created by IntelliJ IDEA.
  User: MarDem
  Date: 15.09.2019
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Krok 1 - wybór kąta montażu</title>
    <!-- Stepper CSS -->
    <link href="css/addons-pro/steppers.css" rel="stylesheet">
    <!-- Stepper CSS - minified-->
    <link href="css/addons-pro/steppers.min.css" rel="stylesheet">

    <!-- Stepper JavaScript -->
    <script type="text/javascript" src="js/addons-pro/stepper.js"></script>
    <!-- Stepper JavaScript - minified -->
    <script type="text/javascript" src="js/addons-pro/stepper.min.js"></script>
</head>

<body>

<ul class="stepper linear">
    <form:form method="post" modelAttribute="windowDTO" action="/krok-1">
    <form:select path="mountingAngle">
    <li class="step active">
        <div data-step-label="Kąt montażu" class="step-title waves-effect waves-dark">Krok 1</div>

        <div class="container">
            <div class="row">
                <div class="col">
                    <!-- Card Dark -->
                    <div class="card">

                        <!-- Card image -->
                        <div class="view overlay">
                            <img class="card-img-top"
                                 src="https://www.okpol.pl/wp-content/uploads/2014/10/ISO-E3-300x300.jpg"
                                 alt="Card image cap">
                            <a>
                                <div class="mask rgba-white-slight"></div>
                            </a>
                        </div>

                        <!-- Card content -->
                        <div class="card-body elegant-color white-text rounded-bottom">

                            <!-- Title -->
                            <h4 class="card-title">Okna obrotowe</h4>
                            <hr class="hr-light">
                            <!-- Text -->
                            <p class="card-text white-text mb-4">Okna obrotowa to popularna, rynkowa propozycja,
                                stworzona dla prawdziwych miłośników wygody.</p>
                            <!-- Link -->
                            <form:option label="${mountingList.get(3).name}" type="submit"
                                         class="btn btn-danger" value="${mountingList.get(3).id}"/>
                        </div>

                    </div>
                    <!-- Card Dark -->
                </div>

                <div class="col">
                    <!-- Card Dark -->
                    <div class="card">

                        <!-- Card image -->
                        <div class="view overlay">
                            <img class="card-img-top"
                                 src="https://www.okpol.pl/wp-content/uploads/2014/11/2017-01-09_ISK_SALON-265x265.jpg"
                                 alt="Card image cap">
                            <a>
                                <div class="mask rgba-white-slight"></div>
                            </a>
                        </div>

                        <!-- Card content -->
                        <div class="card-body elegant-color white-text rounded-bottom">

                            <!-- Title -->
                            <h4 class="card-title">Okna uchy-przesuw</h4>
                            <hr class="hr-light">
                            <!-- Text -->
                            <p class="card-text white-text mb-4">Wyróżnikiem okien uchylno-przesuwnych OKPOL jest
                                wyjątkowa, umożliwiająca ich otwieranie do poziomu 60 stopni.</p>
                            <!-- Link -->
                            <form:option label="${mountingList.get(2).name}" type="submit"
                                         class="btn btn-danger" value="${mountingList.get(2).id}"/>
                        </div>

                    </div>
                    <!-- Card Dark -->
                </div>

                <div class="col">
                    <!-- Card Dark -->
                    <div class="card">

                        <!-- Card image -->
                        <div class="view overlay">
                            <img class="card-img-top"
                                 src="https://www.okpol.pl/wp-content/uploads/2014/11/PGX-KUCHNIA_xs-300x300.jpg"
                                 alt="Card image cap">
                            <a>
                                <div class="mask rgba-white-slight"></div>
                            </a>
                        </div>

                        <!-- Card content -->
                        <div class="card-body elegant-color white-text rounded-bottom">

                            <!-- Title -->
                            <h4 class="card-title">Okna na płaski dach</h4>
                            <hr class="hr-light">
                            <!-- Text -->
                            <p class="card-text white-text mb-4">Okna do dachów płaskich w nowoczesnych rozwiązaniach
                                architektonicznych umożliwia dostarczenie dużej ilości światła.</p>
                            <!-- Link -->
                            <form:option label="${mountingList.get(1).name}" type="submit"
                                         class="btn btn-danger" value="${mountingList.get(1).id}"/>
                        </div>

                    </div>
                    <!-- Card Dark -->
                </div>

                <div class="col">
                    <!-- Card Dark -->
                    <div class="card">

                        <!-- Card image -->
                        <div class="view overlay">
                            <img class="card-img-top" src="https://www.okpol.pl/wp-content/uploads/2015/10/KDU-KDN.jpg"
                                 alt="Card image cap">
                            <a>
                                <div class="mask rgba-white-slight"></div>
                            </a>
                        </div>

                        <!-- Card content -->
                        <div class="card-body elegant-color white-text rounded-bottom">

                            <!-- Title -->
                            <h4 class="card-title">Okna kolankowe</h4>
                            <hr class="hr-light">
                            <!-- Text -->
                            <p class="card-text white-text mb-4">Okna kolankowe OKPOL to designerski sposób na
                                stworzenie jasnej i przestrzennej aranżacji poddasza.</p>
                            <!-- Link -->
                            <form:option label="${mountingList.get(4).name}" type="submit"
                                         class="btn btn-danger" value="${mountingList.get(4).id}"/>
                        </div>

                    </div>
                    <!-- Card Dark -->
                </div>

            </div>
        </div>
        </form:select>
        </form:form>
    </li>
    <li class="step">
        <div class="step-title waves-effect waves-dark">Step 2</div>
        <div class="step-new-content">
            <div class="row">
                <div class="md-form col-12 ml-auto">
                    <input id="password-linear" type="password" class="form-control validate" required>
                    <label for="password-linear">Your password</label>
                </div>
            </div>
            <div class="step-actions">
                <button class="waves-effect waves-dark btn btn-sm btn-primary next-step">CONTINUE</button>
                <button class="waves-effect waves-dark btn btn-sm btn-secondary previous-step">BACK</button>
            </div>
        </div>
    </li>
    <li class="step">
        <div class="step-title waves-effect waves-dark">Step 3</div>
        <div class="step-new-content">
            Finish!
            <div class="step-actions">
                <button class="waves-effect waves-dark btn btn-sm btn-primary m-0 mt-4" type="button">SUBMIT</button>
            </div>
        </div>
    </li>
</ul>
</body>
</html>
