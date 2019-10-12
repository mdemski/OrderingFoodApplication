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
        <h2 class="h1-responsive font-weight-bold my-5">Lista okien dachowych cennikowych</h2>

        <div class="container">
            <c:set var="count" value="1"/>
            <div class="row">
                <c:forEach items="${priceListWindows}" var="window">
                    <c:if test="${count % 4 == 0.0}">
                        <div class="row">
                            <div class="col-4">
                                <!-- Card Dark -->
                                <div class="card">

                                    <!-- Card image -->
                                    <div class="view overlay">
                                        <img class="card-img-top"
                                             src="${mainUrl}resources/static/isoE2.png"
                                             alt="Card image cap">
                                        <a>
                                            <div class="mask rgba-white-slight"></div>
                                        </a>
                                    </div>

                                    <!-- Card content -->
                                    <div class="card-body elegant-color white-text rounded-bottom">

                                        <!-- Title -->
                                        <h4 class="card-title">${window.name}</h4>
                                        <hr class="hr-light">
                                        <!-- Text -->
                                        <p class="card-text white-text mb-4">${window.description}</p>
                                        <!-- Link -->
                                        <input type="submit"
                                               class="btn btn-danger" value="Dodaj do zamówienia: ${window.price}"/>
                                    </div>
                                </div>
                                <!-- Card Dark -->
                            </div>
                        </div>
                    </c:if>
                    <div class="col-4">
                        <!-- Card Dark -->
                        <div class="card">

                            <!-- Card image -->
                            <div class="view overlay">
                                <img class="card-img-top"
                                     src="${mainUrl}resources/static/isoE2.png"
                                     alt="Card image cap">
                                <a>
                                    <div class="mask rgba-white-slight"></div>
                                </a>
                            </div>

                            <!-- Card content -->
                            <div class="card-body elegant-color white-text rounded-bottom">

                                <!-- Title -->
                                <h4 class="card-title">${window.name}</h4>
                                <hr class="hr-light">
                                <!-- Text -->
                                <p class="card-text white-text mb-4">${window.description}</p>
                                <!-- Link -->
                                <input type="submit"
                                       class="btn btn-danger" value="Dodaj do zamówienia: ${window.price}"/>
                            </div>
                        </div>
                        <!-- Card Dark -->
                    </div>
<%--                    ${count = count + 1}--%>
                </c:forEach>
            </div>
    </section>
</main>

<jsp:include page="footer.jsp"/>
