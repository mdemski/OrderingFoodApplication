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
<html>
<head>
    <title>Rejestracja użytkownika</title>
</head>
<body>
<div>

    <!-- Card -->
    <div class="card">

        <!-- Card image -->
        <img class="card-img-top" src="https://mdbootstrap.com/img/Photos/Others/images/43.jpg" alt="Card image cap">

        <!-- Card content -->
        <div class="card-body">

            <form:form class="text-center border border-light p-5" method="post" modelAttribute="data">

                <p class="h4 mb-4">Zarejestruj się</p>

                <!-- Użytkownik -->
                <form:input path="firstName" id="defaultLoginFormEmail" class="form-control mb-4"
                            placeholder="Użytkownik"/>

                <!-- Email -->
                <form:input path="email" id="defaultLoginFormEmail" class="form-control mb-4" placeholder="E-mail"/>

                <!-- Password -->
                <form:password path="password" id="defaultLoginFormPassword" class="form-control mb-4"
                               placeholder="Hasło"/>

                <!-- RePassword -->
                <form:password path="rePassword" id="defaultLoginFormPassword" class="form-control mb-4"
                               placeholder="Powtórz hasło"/>

                <p class="h4 mb-4">Dane firmy</p>

                <!-- Nazwa firmy -->
                <form:input path="companyName" id="defaultLoginFormEmail" class="form-control mb-4"
                            placeholder="Nazwa firmy"/>

                <!-- Miasto -->
                <form:input path="city" id="defaultLoginFormEmail" class="form-control mb-4" placeholder="Miasto"/>

                <!-- Adres -->
                <form:input path="address" id="defaultLoginFormEmail" class="form-control mb-4" placeholder="Adres"/>

                <!-- Kod pocztowy -->
                <form:input path="postCode" id="defaultLoginFormEmail" class="form-control mb-4"
                            placeholder="Kod pocztowy"/>

                <!-- NIP -->
                <form:input path="companyNip" id="defaultLoginFormEmail" class="form-control mb-4" placeholder="NIP"/>

                <p class="h4 mb-4">Osoba kontaktowa</p>

                <!-- Imię osoby kontaktowej -->
                <form:input path="contactFirstName" id="defaultLoginFormEmail" class="form-control mb-4"
                            placeholder="Imię"/>

                <!-- Nazwisko osoby kontaktowej -->
                <form:input path="contactLastName" id="defaultLoginFormEmail" class="form-control mb-4"
                            placeholder="Nazwisko"/>

                <!-- Potwierdzenie regulaminu -->
                <form:checkbox path="statuteKnowledge" id="defaultLoginFormEmail"
                               class="form-control mb-4"/> Zapoznałem się i akceptuję warunki
                <a href='<c:url value="/rejestracja/regulamin"/>'>regulaminu</a>.

                <!-- Register button -->
                <button class="btn btn-info btn-block my-4" type="submit">Zarejestruj</button>
                <!-- Reset button -->
                <button class="btn btn-info btn-block my-4" type="reset">Wyczyść dane</button>

                <a href='<c:url value="/login"/>'>Mam już konto</a>

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
</body>
</html>
