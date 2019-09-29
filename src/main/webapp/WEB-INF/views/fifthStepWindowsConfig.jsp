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
<main>
    <ul class="stepper linear">
        <form:form method="post" modelAttribute="windowDTO" action="/konfigurator/okna-dachowe/krok-1">
            <li class="step">
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
                                    <form:input path="mountingAngleId" type="submit"
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
                                    <p class="card-text white-text mb-4">Wyróżnikiem okien uchylno-przesuwnych OKPOL
                                        jest
                                        wyjątkowa, umożliwiająca ich otwieranie do poziomu 60 stopni.</p>
                                    <!-- Link -->
                                        <%--                            <form:radiobutton path="mountingAngle" type="submit"--%>
                                        <%--                                              class="btn btn-danger" value="${mountingList.get(2).id}"/>--%>
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
                                    <p class="card-text white-text mb-4">Okna do dachów płaskich w nowoczesnych
                                        rozwiązaniach
                                        architektonicznych umożliwia dostarczenie dużej ilości światła.</p>
                                    <!-- Link -->
                                        <%--                            <form:radiobutton path="mountingAngle" type="submit"--%>
                                        <%--                                              class="btn btn-danger" value="${mountingList.get(1).id}"/>--%>
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
                                         src="https://www.okpol.pl/wp-content/uploads/2015/10/KDU-KDN.jpg"
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
                                        <%--                            <form:radiobutton path="mountingAngle" type="submit"--%>
                                        <%--                                              class="btn btn-danger" value="${mountingList.get(4).id}"/>--%>
                                </div>
                            </div>
                            <!-- Card Dark -->
                        </div>
                    </div>
                </div>
            </li>
        </form:form>
        <form:form method="post" modelAttribute="windowDTO" action="/konfigurator/okna-dachowe/krok-2">
            <li class="step">
                <div data-step-label="Materiał wykonania" class="step-title waves-effect waves-dark">Krok 2</div>

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
                                    <h4 class="card-title">Drewniane SOLID</h4>
                                    <hr class="hr-light">
                                    <!-- Text -->
                                    <p class="card-text white-text mb-4">Stolarka SOLID cechuję się wysoką sztywności i
                                        trwałością.</p>
                                    <!-- Link -->
                                        <%--                                <form:option label="${materials.get(1).name}" type="submit"--%>
                                        <%--                                             class="btn btn-danger" value="${materials.get(1).id}"/>--%>
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
                                    <h4 class="card-title">Okna obrotowe</h4>
                                    <hr class="hr-light">
                                    <!-- Text -->
                                    <p class="card-text white-text mb-4">Stolarka SOLID cechuję się najwyższą
                                        sztywnością i
                                        trwałością.</p>
                                    <!-- Link -->
                                    <form:hidden path="id"/>
                                    <form:hidden path="mountingAngleId"/>
                                    <form:input path="materialId" type="submit"
                                                class="btn btn-danger" value="${materials.get(1).id}"/>
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
                                    <h4 class="card-title">PVC SOLID</h4>
                                    <hr class="hr-light">
                                    <!-- Text -->
                                    <p class="card-text white-text mb-4">Stolarka PVC umożliwia wieloletnie korzystanie
                                        bez
                                        konieczności konserwacji.</p>
                                    <!-- Link -->
                                        <%--                                <form:option label="${materials.get(3).name}" type="submit"--%>
                                        <%--                                             class="btn btn-danger" value="${materials.get(3).id}"/>--%>
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
                                         src="https://www.okpol.pl/wp-content/uploads/2015/10/KDU-KDN.jpg"
                                         alt="Card image cap">
                                    <a>
                                        <div class="mask rgba-white-slight"></div>
                                    </a>
                                </div>

                                <!-- Card content -->
                                <div class="card-body elegant-color white-text rounded-bottom">

                                    <!-- Title -->
                                    <h4 class="card-title">PVC SOLID+</h4>
                                    <hr class="hr-light">
                                    <!-- Text -->
                                    <p class="card-text white-text mb-4">Stolarka PVC umożliwia wieloletnie korzystanie
                                        bez
                                        konieczności konserwacji.</p>
                                    <!-- Link -->
                                        <%--                                <form:option label="${materials.get(4).name}" type="submit"--%>
                                        <%--                                             class="btn btn-danger" value="${materials.get(4).id}"/>--%>
                                </div>

                            </div>
                            <!-- Card Dark -->
                        </div>

                    </div>
                </div>
            </li>
        </form:form>
        <form:form method="post" modelAttribute="windowDTO" action="/konfigurator/okna-dachowe/krok-3">
            <li class="step">
                <div data-step-label="Typ otwierania" class="step-title waves-effect waves-dark">Krok 3</div>

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
                                    <h4 class="card-title">Drewniane SOLID</h4>
                                    <hr class="hr-light">
                                    <!-- Text -->
                                    <p class="card-text white-text mb-4">Stolarka SOLID cechuję się wysoką sztywności i
                                        trwałością.</p>
                                    <!-- Link -->
                                        <%--                                <form:option label="${materials.get(1).name}" type="submit"--%>
                                        <%--                                             class="btn btn-danger" value="${materials.get(1).id}"/>--%>
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
                                    <h4 class="card-title">Drewniane SOLID+</h4>
                                    <hr class="hr-light">
                                    <!-- Text -->
                                    <p class="card-text white-text mb-4">Okna obrotowa to popularna, rynkowa propozycja,
                                        stworzona dla prawdziwych miłośników wygody.</p>
                                    <!-- Link -->
                                    <form:hidden path="id"/>
                                    <form:hidden path="mountingAngleId"/>
                                    <form:hidden path="materialId"/>
                                    <form:input path="openingTypeId" type="submit"
                                                class="btn btn-danger" value="${openingTypes.get(0).id}"/>
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
                                    <h4 class="card-title">PVC SOLID</h4>
                                    <hr class="hr-light">
                                    <!-- Text -->
                                    <p class="card-text white-text mb-4">Stolarka PVC umożliwia wieloletnie korzystanie
                                        bez
                                        konieczności konserwacji.</p>
                                    <!-- Link -->
                                        <%--                                <form:option label="${materials.get(3).name}" type="submit"--%>
                                        <%--                                             class="btn btn-danger" value="${materials.get(3).id}"/>--%>
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
                                         src="https://www.okpol.pl/wp-content/uploads/2015/10/KDU-KDN.jpg"
                                         alt="Card image cap">
                                    <a>
                                        <div class="mask rgba-white-slight"></div>
                                    </a>
                                </div>

                                <!-- Card content -->
                                <div class="card-body elegant-color white-text rounded-bottom">

                                    <!-- Title -->
                                    <h4 class="card-title">PVC SOLID+</h4>
                                    <hr class="hr-light">
                                    <!-- Text -->
                                    <p class="card-text white-text mb-4">Stolarka PVC umożliwia wieloletnie korzystanie
                                        bez
                                        konieczności konserwacji.</p>
                                    <!-- Link -->
                                        <%--                                <form:option label="${materials.get(4).name}" type="submit"--%>
                                        <%--                                             class="btn btn-danger" value="${materials.get(4).id}"/>--%>
                                </div>

                            </div>
                            <!-- Card Dark -->
                        </div>
                    </div>
                </div>
            </li>
        </form:form>
        <form:form method="post" modelAttribute="windowDTO" action="/konfigurator/okna-dachowe/krok-4">
            <li class="step">
                <div data-step-label="Wymiary" class="step-title waves-effect waves-dark">Krok 4</div>
                <form:hidden path="id"/>
                <form:hidden path="mountingAngleId"/>
                <form:hidden path="materialId"/>
                <form:hidden path="openingTypeId"/>
                <div class="md-form form-lg">
                    <form:input path="width" type="number" id="inputLGEx" class="form-control form-control-lg"/>
                    <form:label path="width" for="inputLGEx">Szerokość [mm]</form:label>
                </div>
                <div class="md-form form-lg">
                    <form:input path="height" type="number" id="inputLGEx" class="form-control form-control-lg"/>
                    <form:label path="height" for="inputLGEx">Wysokość [mm]</form:label>
                </div>
                <button type="submit" class="btn btn-danger">Zatwierdź</button>

            </li>
        </form:form>
        <form:form method="post" modelAttribute="windowDTO" action="/konfigurator/okna-dachowe/krok-5">
            <li class="step">
                <div data-step-label="Pakiet szybowy" class="step-title waves-effect waves-dark">Krok 5</div>

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
                                    <h4 class="card-title">Drewniane SOLID</h4>
                                    <hr class="hr-light">
                                    <!-- Text -->
                                    <p class="card-text white-text mb-4">Stolarka SOLID cechuję się wysoką sztywności i
                                        trwałością.</p>
                                    <!-- Link -->
                                        <%--                                <form:option label="${materials.get(1).name}" type="submit"--%>
                                        <%--                                             class="btn btn-danger" value="${materials.get(1).id}"/>--%>
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
                                    <h4 class="card-title">Drewniane SOLID+</h4>
                                    <hr class="hr-light">
                                    <!-- Text -->
                                    <p class="card-text white-text mb-4">Okna obrotowa to popularna, rynkowa propozycja,
                                        stworzona dla prawdziwych miłośników wygody.</p>
                                    <!-- Link -->
                                    <form:hidden path="id"/>
                                    <form:hidden path="mountingAngleId"/>
                                    <form:hidden path="materialId"/>
                                    <form:hidden path="openingTypeId"/>
                                    <form:hidden path="width"/>
                                    <form:hidden path="height"/>
                                    <form:input path="glazingTypeId" type="submit"
                                                class="btn btn-danger" value="${glazingTypes.get(0).id}"/>
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
                                    <h4 class="card-title">PVC SOLID</h4>
                                    <hr class="hr-light">
                                    <!-- Text -->
                                    <p class="card-text white-text mb-4">Stolarka PVC umożliwia wieloletnie korzystanie
                                        bez
                                        konieczności konserwacji.</p>
                                    <!-- Link -->
                                        <%--                                <form:option label="${materials.get(3).name}" type="submit"--%>
                                        <%--                                             class="btn btn-danger" value="${materials.get(3).id}"/>--%>
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
                                         src="https://www.okpol.pl/wp-content/uploads/2015/10/KDU-KDN.jpg"
                                         alt="Card image cap">
                                    <a>
                                        <div class="mask rgba-white-slight"></div>
                                    </a>
                                </div>

                                <!-- Card content -->
                                <div class="card-body elegant-color white-text rounded-bottom">

                                    <!-- Title -->
                                    <h4 class="card-title">PVC SOLID+</h4>
                                    <hr class="hr-light">
                                    <!-- Text -->
                                    <p class="card-text white-text mb-4">Stolarka PVC umożliwia wieloletnie korzystanie
                                        bez
                                        konieczności konserwacji.</p>
                                    <!-- Link -->
                                        <%--                                <form:option label="${materials.get(4).name}" type="submit"--%>
                                        <%--                                             class="btn btn-danger" value="${materials.get(4).id}"/>--%>
                                </div>

                            </div>
                            <!-- Card Dark -->
                        </div>
                    </div>
                </div>
            </li>
        </form:form>
    </ul>
</main>

<jsp:include page="footer.jsp"/>
