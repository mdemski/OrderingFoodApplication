<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"/>
<%--
  Created by IntelliJ IDEA.
  User: MarDem
  Date: 2019-09-01
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url var="mainUrl" value="/"/>
<main>
<div>
    <div class="container">
        <div class="row">
            <div class="col">
            </div>
            <div class="col">
                <!-- Card -->
                <div class="card">

                    <!-- Card image -->
                    <img class="card-img-top" src="${mainUrl}resources/static/antique-backdrop-background-164005.jpg"
                         alt="Card image cap">

                    <!-- Card content -->
                    <div class="card-body">

                        <form:form class="text-center border border-light p-5" method="post" modelAttribute="data">
                            <form:errors path="*"/>
                            <p class="h4 mb-4">Zarejestruj się</p>

                            <!-- Użytkownik -->
                            <form:input path="firstName" id="defaultLoginFormEmail" class="form-control mb-4"
                                        placeholder="Użytkownik"/>

                            <!-- Email -->
                            <form:input path="email" id="defaultLoginFormEmail" class="form-control mb-4"
                                        placeholder="E-mail"/>

                            <!-- Password -->
                            <form:password path="password" id="defaultLoginFormPassword" class="form-control mb-4"
                                           placeholder="Hasło"/>

                            <!-- RePassword -->
                            <form:password path="rePassword" id="defaultLoginFormPassword" class="form-control mb-4"
                                           placeholder="Powtórz hasło"/>

                            <p class="h4 mb-4">Firma</p>
                            <!-- Nazwa firmy -->
                            <form:select path="companyName" items="${companies}"/><br><br>

                            <!-- Potwierdzenie regulaminu -->
                            <form:checkbox path="statuteKnowledge" id="defaultLoginFormEmail"
                                           class="form-control mb-4"/> Zapoznałem się i akceptuję warunki
                            <a href='<c:url value="/rejestracja/regulamin"/>'>regulaminu</a>.

                            <!-- Register button -->
                            <button class="btn btn-info btn-block my-4" type="submit">Zarejestruj</button>
                            <!-- Reset button -->
                            <button class="btn btn-info btn-block my-4" type="reset">Wyczyść dane</button>

                            <p class="h6 mb-4">Brakuje firmy w zestawieniu?</p>
                            <a type="button" class="btn btn-primary" href='${mainUrl}firmy/dodaj-firme'>Dodaj</a><br><br>
                            <a href='${mainUrl}login'>Mam już konto</a>

                            <a type="button" class="light-blue-text mx-2" href="https://pl-pl.facebook.com/oknadachowe">
                                <i class="fab fa-facebook-f"></i>
                            </a>
                            <a type="button" class="light-blue-text mx-2" href="https://www.instagram.com/okna_okpol/">
                                <i class="fab fa-instagram"></i>
                            </a>
                            <a type="button" class="light-blue-text mx-2" href="https://www.okpol.pl/">
                                <i class="fab fa-github"></i>
                            </a>

                        </form:form>

                    </div>

                </div>
                <!-- Card -->
            </div>
            <div class="col">
            </div>
        </div>
    </div>
</div>
</main>

<jsp:include page="footer.jsp"/>
