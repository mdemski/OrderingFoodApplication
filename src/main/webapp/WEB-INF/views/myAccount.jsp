<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header.jsp"/>
<%--
  Created by IntelliJ IDEA.
  User: MarDem
  Date: 15.09.2019
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<c:url var="mainUrl" value="/"/>
<main>
    <div class="container">
        <div class="row">
            <div class="col">
                <!-- Card Dark -->
                <div class="card">
                    <!-- Card image -->
                    <div class="view overlay">
                        <img class="card-img-top"
                             src="${mainUrl}resources/static/candy-color-creative-54633.jpg"
                             alt="Card image cap">
                        <a href="${mainUrl}/moje-konto/${userId}/moje-konfiguracje">
                            <div class="mask rgba-white-slight"></div>
                        </a>
                    </div>

                    <!-- Card content -->
                    <div class="card-body elegant-color white-text rounded-bottom">

                        <!-- Title -->
                        <h4 class="card-title">Moje konfiguracje</h4>
                        <hr class="hr-light">
                        <!-- Text -->
                        <p class="card-text white-text mb-4">Lista wszytskich moich konfiguracji</p>
                        <!-- Link -->
                        <a href="${mainUrl}/moje-konto/${userId}/moje-konfiguracje">Moje konfiguracje</a>
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
                             src="${mainUrl}resources/static/logistics-lorry-mountains-93398.jpg"
                             alt="Card image cap">
                        <a href="${mainUrl}/moje-konto/${userId}/moje-zamowienia">
                            <div class="mask rgba-white-slight"></div>
                        </a>

                    </div>

                    <!-- Card content -->
                    <div class="card-body elegant-color white-text rounded-bottom">

                        <!-- Title -->
                        <h4 class="card-title">Moje zamówienia</h4>
                        <hr class="hr-light">
                        <!-- Text -->
                        <p class="card-text white-text mb-4">Lista wszystkich moich zamówień</p>
                        <!-- Link -->
                        <a href="${mainUrl}/moje-konto/${userId}/moje-zamowienia">Moje zamówienia</a>

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
                             src="${mainUrl}resources/static/black-and-white-close-up-equipment-210881.jpg"
                             alt="Card image cap">
                        <a href="${mainUrl}/moje-konto/${userId}/moje-ustawienia">
                            <div class="mask rgba-white-slight"></div>
                        </a>
                    </div>

                    <!-- Card content -->
                    <div class="card-body elegant-color white-text rounded-bottom">

                        <!-- Title -->
                        <h4 class="card-title">Moje ustawienia</h4>
                        <hr class="hr-light">
                        <!-- Text -->
                        <p class="card-text white-text mb-4">Zamień ustawienia swojego konta</p>
                        <!-- Link -->
                        <a href="${mainUrl}/moje-konto/${userId}/moje-ustawienia">Moje ustawienia</a>

                    </div>

                </div>
                <!-- Card Dark -->
            </div>
        </div>
    </div>
</main>

<jsp:include page="footer.jsp"/>
