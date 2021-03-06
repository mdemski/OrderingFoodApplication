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
<c:url var="mainUrl" value="/"/>
<main>
<section class="text-center my-5">

    <!-- Section heading -->
    <h2 class="h1-responsive font-weight-bold my-5">Witamy w konfiguratorze</h2>
    <!-- Section description -->
    <p class="dark-grey-text w-responsive mx-auto mb-5">Skonfiguruj swoją własną kompozycję, przekonaj się sam jakie to
        proste</p>

    <!-- Grid row -->
    <div class="row">

        <!-- Grid column -->
        <div class="col-lg-4 col-md-12 mb-lg-0 mb-4">

            <!-- Featured image -->
            <div class="view overlay rounded z-depth-2 mb-4">
                <img class="img-fluid" src="${mainUrl}resources/static/roof-windows.png"
                     alt="Okna dachowe OKPOL">
                <a href="${mainUrl}konfigurator/okna-dachowe/krok-1">
                    <div class="mask rgba-white-slight"></div>
                </a>
            </div>

            <!-- Category -->
            <a href="${mainUrl}konfigurator/okna-dachowe/krok-1" class="pink-text">
                <h6 class="font-weight-bold mb-3"><i class="fas fa-map pr-2"></i>Okna dachowe</h6>
            </a>
            <!-- Excerpt -->
            <p class="dark-grey-text">Konfigurator okien dachowych.</p>

        </div>
        <!-- Grid column -->

        <!-- Grid column -->
        <div class="col-lg-4 col-md-6 mb-md-0 mb-4">

            <!-- Featured image -->
            <div class="view overlay rounded z-depth-2 mb-4">
                <img class="img-fluid" src="${mainUrl}resources/static/flashings.png"
                     alt="Kołnierze uszczelniające OKPOL">
                <a>
                    <div class="mask rgba-white-slight"></div>
                </a>
            </div>

            <!-- Category -->
            <a href="#!"
               class="deep-orange-text">
                <h6 class="font-weight-bold mb-3"><i class="fas fa-graduation-cap pr-2"></i>Kołnierze uszczelniające
                </h6>
            </a>
            <!-- Excerpt -->
            <p class="dark-grey-text">Konfigurator kołnierzy - integralnej części okien. Standardwowo przygotowaliśmy
                dla Ciebie podstawową kompozycję.</p>

        </div>
        <!-- Grid column -->

        <!-- Grid column -->
        <div class="col-lg-4 col-md-6 mb-0">

            <!-- Featured image -->
            <div class="view overlay rounded z-depth-2 mb-4">
                <img class="img-fluid" src="${mainUrl}resources/static/connection-in-roof.png"
                     alt="Kołnierze modułowe">
                <a>
                    <div class="mask rgba-white-slight"></div>
                </a>
            </div>

            <!-- Category -->
            <a href="#!" class="blue-text">
                <h6 class="font-weight-bold mb-3"><i class="fas fa-fire pr-2"></i>Kołnierze modułowe</h6>
            </a>
            <!-- Excerpt -->
            <p class="dark-grey-text">Stwórz kompozucję kilku okien obok, pod, nad sobą. Dostarczy Ci to wiele cennego
                światła.</p>

        </div>
        <!-- Grid column -->

    </div>
    <!-- Grid row -->
</section>
</main>

<jsp:include page="footer.jsp"/>
