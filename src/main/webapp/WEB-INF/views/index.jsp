<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"/>
<%--
  Created by IntelliJ IDEA.
  User: MarDem
  Date: 15.09.2019
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<main>
<section class="text-center my-5">

    <!-- Section heading -->
    <h2 class="h1-responsive font-weight-bold my-5">Konfigurator okien dachowych</h2>
    <!-- Section description -->
    <p class="dark-grey-text w-responsive mx-auto mb-5">Oddajemy w Twoje ręce narzędzie do konfigurowania, wyceny,
        zamawiania i śledzenia zamówień</p>

    <!-- Grid row -->
    <div class="row">

        <!-- Grid column -->
        <div class="col-lg-4 col-md-12 mb-lg-0 mb-4">

            <!-- Featured image -->
            <div class="view overlay rounded z-depth-2 mb-4">
                <img class="img-fluid" src="https://www.okpol.pl/wp-content/uploads/2018/03/6.1.jpg"
                     alt="Konfigurator">
                <a>
                    <div class="mask rgba-white-slight"></div>
                </a>
            </div>

            <!-- Category -->
            <a href="<c:url value="/konfigurator"/>" class="pink-text">
                <h6 class="font-weight-bold mb-3"><i class="fas fa-map pr-2"></i>Konfigurator</h6>
            </a>
            <!-- Excerpt -->
            <p class="dark-grey-text">Skonfiguruj, wyceń i zamów swoją własną kompozycję</p>

        </div>
        <!-- Grid column -->

        <!-- Grid column -->
        <div class="col-lg-4 col-md-6 mb-md-0 mb-4">

            <!-- Featured image -->
            <div class="view overlay rounded z-depth-2 mb-4">
                <img class="img-fluid" src="https://www.okpol.pl/wp-content/uploads/2018/03/6.2.jpg"
                     alt="Okna cennikowe OKPOL">
                <a>
                    <div class="mask rgba-white-slight"></div>
                </a>
            </div>

            <!-- Category -->
            <a href="https://www.okpol.pl/wp-content/uploads/katalogi/PL/KATALOG_OKIEN_DACHOWYCH.pdf"
               class="deep-orange-text">
                <h6 class="font-weight-bold mb-3"><i class="fas fa-graduation-cap pr-2"></i>Okna cennikowe</h6>
            </a>
            <!-- Excerpt -->
            <p class="dark-grey-text">Złóż zamówienie na okna ze standardowej oferty</p>

        </div>
        <!-- Grid column -->

        <!-- Grid column -->
        <div class="col-lg-4 col-md-6 mb-0">

            <!-- Featured image -->
            <div class="view overlay rounded z-depth-2 mb-4">
                <img class="img-fluid" src="https://www.okpol.pl/wp-content/uploads/2018/03/9.2.jpg"
                     alt="Zaloguj do systemu">
                <a>
                    <div class="mask rgba-white-slight"></div>
                </a>
            </div>

            <!-- Category -->
            <a href="#!" class="blue-text">
                <h6 class="font-weight-bold mb-3"><i class="fas fa-fire pr-2"></i>Logowanie</h6>
            </a>
            <!-- Excerpt -->
            <p class="dark-grey-text">Zaloguj się do systemu aby móc składać zamówienia, przeglądać historię zamówień
                oraz sprawdzać poziom realizacji własnych zleceń</p>

        </div>
        <!-- Grid column -->

    </div>
    <!-- Grid row -->
</section>
</main>

<jsp:include page="footer.jsp"/>
