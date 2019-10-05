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
    <ul class="stepper linear">
        <%--        <form:form method="post" modelAttribute="windowDTO" action="/konfigurator/okna-dachowe/krok-1">--%>
        <%--            <li class="step">--%>
        <%--                <div data-step-label="Kąt montażu" class="step-title waves-effect waves-dark">Krok 1</div>--%>
        <%--                <div class="container">--%>
        <%--                    <div class="row">--%>
        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/2-15.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">2° - 15°</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Okna do dachów płaskich w nowoczesnych--%>
        <%--                                        rozwiązaniach--%>
        <%--                                        architektonicznych umożliwia dostarczenie dużej ilości światła.</p>--%>
        <%--                                    <!-- Link -->--%>
        <%--                                    <input type="submit"--%>
        <%--                                           class="btn btn-danger" value="${mountingList.get(0).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/15-65.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">15° - 65°</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Wyróżnikiem okien uchylno-przesuwnych OKPOL--%>
        <%--                                        jest--%>
        <%--                                        wyjątkowa, umożliwiająca ich otwieranie do poziomu 60 stopni.</p>--%>
        <%--                                    <input type="submit"--%>
        <%--                                           class="btn btn-danger" value="${mountingList.get(1).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/15-90.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">15° - 90°</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">--%>
        <%--                                        Okna obrotowe to popularna, rynkowa propozycja,--%>
        <%--                                        stworzona dla prawdziwych miłośników wygody.--%>
        <%--                                    </p>--%>
        <%--                                    <form:input path="mountingAngleId" type="submit"--%>
        <%--                                                class="btn btn-danger" value="${mountingList.get(2).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/90(pion).png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">90°(pionowe)</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Okna kolankowe OKPOL to designerski sposób na--%>
        <%--                                        stworzenie jasnej i przestrzennej aranżacji poddasza.</p>--%>
        <%--                                    <input type="submit"--%>
        <%--                                           class="btn btn-danger" value="${mountingList.get(3).id}"/>--%>
        <%--                                </div>--%>
        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>
        <%--                    </div>--%>
        <%--                </div>--%>
        <%--            </li>--%>
        <%--        </form:form>--%>
        <%--        <form:form method="post" modelAttribute="windowDTO" action="/konfigurator/okna-dachowe/krok-2">--%>
        <%--            <li class="step">--%>
        <%--                <div data-step-label="Materiał wykonania" class="step-title waves-effect waves-dark">Krok 2</div>--%>

        <%--                <div class="container">--%>
        <%--                    <div class="row">--%>
        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/solid.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">Drewniane SOLID</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Stolarka SOLID cechuję się wysoką sztywności i--%>
        <%--                                        trwałością. Skrzydło/rama - 116/130 mm.</p>--%>
        <%--                                    <input type="submit"--%>
        <%--                                           class="btn btn-danger" value="${materials.get(0).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/solid+.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">Drewniane SOLID+</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Stolarka SOLID cechuję się najwyższą--%>
        <%--                                        sztywnością i--%>
        <%--                                        trwałością.</p>--%>
        <%--                                    <!-- Link -->--%>
        <%--                                    <form:hidden path="id"/>--%>
        <%--                                    <form:hidden path="mountingAngleId"/>--%>
        <%--                                    <form:input path="materialId" type="submit"--%>
        <%--                                                class="btn btn-danger" value="${materials.get(1).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/pvc_solid.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">PVC SOLID</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Stolarka PVC umożliwia wieloletnie korzystanie--%>
        <%--                                        bez--%>
        <%--                                        konieczności konserwacji.</p>--%>
        <%--                                    <input type="submit"--%>
        <%--                                           class="btn btn-danger" value="${materials.get(2).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/pvc_solid+.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">PVC SOLID+</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Stolarka PVC umożliwia wieloletnie korzystanie--%>
        <%--                                        bez--%>
        <%--                                        konieczności konserwacji.</p>--%>
        <%--                                    <input type="submit"--%>
        <%--                                           class="btn btn-danger" value="${materials.get(3).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                    </div>--%>
        <%--                </div>--%>
        <%--            </li>--%>
        <%--        </form:form>--%>
        <%--        <form:form method="post" modelAttribute="windowDTO" action="/konfigurator/okna-dachowe/krok-3">--%>
        <%--            <li class="step">--%>
        <%--                <div data-step-label="Typ otwierania" class="step-title waves-effect waves-dark">Krok 3</div>--%>

        <%--                <div class="container">--%>
        <%--                    <div class="row">--%>
        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/15-90.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">Obrotowe</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Okna obrotowe to popularna, rynkowa propozycja,--%>
        <%--                                        stworzona dla prawdziwych miłośników wygody.</p>--%>
        <%--                                    <form:hidden path="id"/>--%>
        <%--                                    <form:hidden path="mountingAngleId"/>--%>
        <%--                                    <form:hidden path="materialId"/>--%>
        <%--                                    <form:input path="openingTypeId" type="submit"--%>
        <%--                                                class="btn btn-danger" value="${openingTypes.get(0).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/15-65.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">Uchylno-przesuwne</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Wyróżnikiem okien uchylno-przesuwnych OKPOL--%>
        <%--                                        jest wyjątkowa, umożliwiająca ich otwieranie do poziomu 60 stopni.</p>--%>
        <%--                                    <!-- Link -->--%>
        <%--                                    <input type="submit"--%>
        <%--                                           class="btn btn-danger" value="${openingTypes.get(1).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/wysokoosiowe.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">Wysokoosiowe</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Okna wysokoosiwe stanowią odmianę okien--%>
        <%--                                        obrotowych,--%>
        <%--                                        z powyższoną osią obrotu dla poprawy wygody.</p>--%>
        <%--                                    <input type="submit"--%>
        <%--                                           class="btn btn-danger" value="${openingTypes.get(2).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/2-15.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">Nieotwieralne</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Okna nieotwieralne są propozycją dla osób,--%>
        <%--                                        którym zależy wyłącznie na doświetleniu pomieszczeniu</p>--%>
        <%--                                    <input type="submit"--%>
        <%--                                           class="btn btn-danger" value="${openingTypes.get(3).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>
        <%--                    </div>--%>
        <%--                </div>--%>
        <%--            </li>--%>
        <%--        </form:form>--%>
        <%--        <form:form method="post" modelAttribute="windowDTO" action="/konfigurator/okna-dachowe/krok-4">--%>
        <%--            <li class="step">--%>
        <%--                <div data-step-label="Wymiary" class="step-title waves-effect waves-dark">Krok 4</div>--%>
        <%--                <form:hidden path="id"/>--%>
        <%--                <form:hidden path="mountingAngleId"/>--%>
        <%--                <form:hidden path="materialId"/>--%>
        <%--                <form:hidden path="openingTypeId"/>--%>
        <%--                <div class="md-form form-lg">--%>
        <%--                    <form:errors path="*"/>--%>
        <%--                    <form:input path="width" type="number" id="inputLGEx" class="form-control form-control-lg"/>--%>
        <%--                    <form:label path="width" for="inputLGEx">Szerokość [cm]</form:label>--%>
        <%--                </div>--%>
        <%--                <div class="md-form form-lg">--%>
        <%--                    <form:input path="height" type="number" id="inputLGEx" class="form-control form-control-lg"/>--%>
        <%--                    <form:label path="height" for="inputLGEx">Wysokość [cm]</form:label>--%>
        <%--                </div>--%>
        <%--                <form:button type="submit" class="btn btn-danger">Zatwierdź</form:button>--%>
        <%--            </li>--%>
        <%--        </form:form>--%>
        <%--        <form:form method="post" modelAttribute="windowDTO" action="/konfigurator/okna-dachowe/krok-5">--%>
        <%--            <li class="step">--%>
        <%--                <div data-step-label="Pakiet szybowy" class="step-title waves-effect waves-dark">Krok 5</div>--%>

        <%--                <div class="container">--%>
        <%--                    <div class="row">--%>
        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/dwuszybowy.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">Dwuszybowy E2</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">--%>
        <%--                                        • szyba hartowana <br>--%>
        <%--                                        • gaz szlachetny - argon <br>--%>
        <%--                                        • ciepła ramka międzyszybowa <br>--%>
        <%--                                        • powłoka niskoemisyjna <br>--%>
        <%--                                        • Ug = 1,0 W/m2K--%>
        <%--                                    </p>--%>
        <%--                                    <form:hidden path="id"/>--%>
        <%--                                    <form:hidden path="mountingAngleId"/>--%>
        <%--                                    <form:hidden path="materialId"/>--%>
        <%--                                    <form:hidden path="openingTypeId"/>--%>
        <%--                                    <form:hidden path="width"/>--%>
        <%--                                    <form:hidden path="height"/>--%>
        <%--                                    <form:input path="glazingTypeId" type="submit"--%>
        <%--                                                class="btn btn-danger" value="${glazingTypes.get(0).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/trzyszybowy.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">Trzyszybowy I22</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">--%>
        <%--                                        • 2x szyba hartowana <br>--%>
        <%--                                        • 2x gaz szlachetny - argon <br>--%>
        <%--                                        • 2x ciepła ramka międzyszyb. <br>--%>
        <%--                                        • 2x powłoka niskoemisyjna <br>--%>
        <%--                                        • Ug = 0,5 W/m2K--%>
        <%--                                    </p>--%>
        <%--                                    <!-- Link -->--%>
        <%--                                    <input type="submit"--%>
        <%--                                           class="btn btn-danger" value="${glazingTypes.get(1).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>

        <%--                        </div>--%>

        <%--                        <div class="col">--%>

        <%--                        </div>--%>
        <%--                    </div>--%>
        <%--                </div>--%>
        <%--            </li>--%>
        <%--        </form:form>--%>
        <%--        <form:form method="post" modelAttribute="windowDTO" action="/konfigurator/okna-dachowe/krok-6">--%>
        <%--            <li class="step">--%>
        <%--                <div data-step-label="Kolor zewnętrzny" class="step-title waves-effect waves-dark">Krok 6</div>--%>

        <%--                <div class="container">--%>
        <%--                    <div class="row">--%>
        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/kołnierz_u_ral_7022.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">RAL 7022</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Najbardziej popularny kolor antracytowy--%>
        <%--                                        pasujący do większości dachówek.</p>--%>
        <%--                                    <!-- Link -->--%>
        <%--                                    <form:hidden path="id"/>--%>
        <%--                                    <form:hidden path="mountingAngleId"/>--%>
        <%--                                    <form:hidden path="materialId"/>--%>
        <%--                                    <form:hidden path="openingTypeId"/>--%>
        <%--                                    <form:hidden path="width"/>--%>
        <%--                                    <form:hidden path="height"/>--%>
        <%--                                    <form:hidden path="glazingTypeId"/>--%>
        <%--                                    <form:input path="materialColorId" type="submit"--%>
        <%--                                                class="btn btn-danger" value="${materialColors.get(0).id}"/>--%>
        <%--                                </div>--%>
        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>
        <%--                        <div class="col">--%>

        <%--                        </div>--%>
        <%--                        <div class="col">--%>

        <%--                        </div>--%>
        <%--                        <div class="col">--%>

        <%--                        </div>--%>
        <%--                    </div>--%>
        <%--                </div>--%>
        <%--            </li>--%>
        <%--        </form:form>--%>
        <%--        <form:form method="post" modelAttribute="windowDTO" action="/konfigurator/okna-dachowe/krok-7">--%>
        <%--            <li class="step">--%>
        <%--                <div data-step-label="Wybór klamki" class="step-title waves-effect waves-dark">Krok 7</div>--%>

        <%--                <div class="container">--%>
        <%--                    <div class="row">--%>
        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/klamka_9016_kluczyk.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">Biała<br> z kluczykiem</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Klamka biała w kolorze RAL 9016 wyposażona w kluczyk, pasuje do okien PVC.</p>--%>
        <%--                                    <input type="submit"--%>
        <%--                                           class="btn btn-danger" value="${handles.get(1).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/klamka_7022_kluczyk.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">Szampańska z kluczykiem</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Klamka w kolorze szampańskim wyposażona w kluczyk, pasuje do okien drewnianych.</p>--%>
        <%--                                    <!-- Link -->--%>
        <%--                                    <form:hidden path="id"/>--%>
        <%--                                    <form:hidden path="mountingAngleId"/>--%>
        <%--                                    <form:hidden path="materialId"/>--%>
        <%--                                    <form:hidden path="openingTypeId"/>--%>
        <%--                                    <form:hidden path="width"/>--%>
        <%--                                    <form:hidden path="height"/>--%>
        <%--                                    <form:hidden path="glazingTypeId"/>--%>
        <%--                                    <form:hidden path="materialColorId"/>--%>
        <%--                                    <form:input path="handleId" type="submit"--%>
        <%--                                                class="btn btn-danger"--%>
        <%--                                                value="${handles.get(0).id}"/>--%>
        <%--                                </div>--%>
        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>
        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/klamka_9016_kluczyk.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">Biała<br> bez kluczyka</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Klamka biała w kolorze RAL9016, pasuje do okien drewnianych.</p>--%>
        <%--                                    <input type="submit"--%>
        <%--                                           class="btn btn-danger" value="${handles.get(2).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/klamka_7022_kluczyk.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">Szampańska bez kluczyka</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Klamka w kolorze szampańskim, pasuje do okien drewnianych.</p>--%>
        <%--                                    <input type="submit"--%>
        <%--                                           class="btn btn-danger" value="${handles.get(3).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>
        <%--                    </div>--%>
        <%--                </div>--%>
        <%--            </li>--%>
        <%--        </form:form>--%>
        <%--        <form:form method="post" modelAttribute="windowDTO" action="/konfigurator/okna-dachowe/krok-8">--%>
        <%--            <li class="step">--%>
        <%--                <div data-step-label="Wybór kołnierza" class="step-title waves-effect waves-dark">Krok 8</div>--%>

        <%--                <div class="container">--%>
        <%--                    <div class="row">--%>
        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/kołnierz_u_ral_7022.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">Kołnierz uniwersalny U</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Najbardziej popularny kołnierz pozwalający zamontować okno na wielu pokryciach dachowych</p>--%>
        <%--                                    <form:hidden path="id"/>--%>
        <%--                                    <form:hidden path="mountingAngleId"/>--%>
        <%--                                    <form:hidden path="materialId"/>--%>
        <%--                                    <form:hidden path="openingTypeId"/>--%>
        <%--                                    <form:hidden path="width"/>--%>
        <%--                                    <form:hidden path="height"/>--%>
        <%--                                    <form:hidden path="glazingTypeId"/>--%>
        <%--                                    <form:hidden path="materialColorId"/>--%>
        <%--                                    <form:hidden path="handleId"/>--%>
        <%--                                    <form:input path="flashingNameId" type="submit"--%>
        <%--                                                class="btn btn-danger" value="${flashings.get(0).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>
        <%--                            &lt;%&ndash;Empty card div&ndash;%&gt;--%>
        <%--                        </div>--%>
        <%--                        <div class="col">--%>
        <%--                                &lt;%&ndash;Empty card div&ndash;%&gt;--%>
        <%--                        </div>--%>
        <%--                        <div class="col">--%>
        <%--                                &lt;%&ndash;Empty card div&ndash;%&gt;--%>
        <%--                        </div>--%>
        <%--                    </div>--%>
        <%--                </div>--%>
        <%--            </li>--%>
        <%--        </form:form>--%>
        <%--        <form:form method="post" modelAttribute="windowDTO" action="/konfigurator/okna-dachowe/krok-9">--%>
        <%--            <li class="step">--%>
        <%--                <div data-step-label="Wybór nawiewnika" class="step-title waves-effect waves-dark">Krok 9</div>--%>

        <%--                <div class="container">--%>
        <%--                    <div class="row">--%>
        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/solid+.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">Neo-Air</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">Nawiwenik ten cechuja bardzo wysoka wydajność wymiany powietrza oraz estetyczny design.</p>--%>
        <%--                                    <form:hidden path="id"/>--%>
        <%--                                    <form:hidden path="mountingAngleId"/>--%>
        <%--                                    <form:hidden path="materialId"/>--%>
        <%--                                    <form:hidden path="openingTypeId"/>--%>
        <%--                                    <form:hidden path="width"/>--%>
        <%--                                    <form:hidden path="height"/>--%>
        <%--                                    <form:hidden path="glazingTypeId"/>--%>
        <%--                                    <form:hidden path="materialColorId"/>--%>
        <%--                                    <form:hidden path="handleId"/>--%>
        <%--                                    <form:hidden path="flashingNameId"/>--%>
        <%--                                    <form:input path="ventilatorId" type="submit"--%>
        <%--                                                class="btn btn-danger" value="${ventilators.get(0).id}"/>--%>
        <%--                                </div>--%>

        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                            <div class="card">--%>

        <%--                                <!-- Card image -->--%>
        <%--                                <div class="view overlay">--%>
        <%--                                    <img class="card-img-top"--%>
        <%--                                         src="${mainUrl}resources/static/solid.png"--%>
        <%--                                         alt="Card image cap">--%>
        <%--                                    <a>--%>
        <%--                                        <div class="mask rgba-white-slight"></div>--%>
        <%--                                    </a>--%>
        <%--                                </div>--%>

        <%--                                <!-- Card content -->--%>
        <%--                                <div class="card-body elegant-color white-text rounded-bottom">--%>

        <%--                                    <!-- Title -->--%>
        <%--                                    <h4 class="card-title">Bez nawiewnika</h4>--%>
        <%--                                    <hr class="hr-light">--%>
        <%--                                    <!-- Text -->--%>
        <%--                                    <p class="card-text white-text mb-4">W budownictwie z mechaniczną wymianą powietrza w takich przypadkach lepiej sprawdzi się okno pozbawione nawiewnika.</p>--%>
        <%--                                    <!-- Link -->--%>
        <%--                                    <input type="submit"--%>
        <%--                                           class="btn btn-danger" value="${ventilators.get(1).id}"/>--%>
        <%--                                </div>--%>
        <%--                            </div>--%>
        <%--                            <!-- Card Dark -->--%>
        <%--                        </div>--%>
        <%--                        <div class="col">--%>
        <%--                            <!--Empty Card Dark -->--%>
        <%--                        </div>--%>

        <%--                        <div class="col">--%>
        <%--                            <!--Empty Card Dark -->--%>
        <%--                        </div>--%>
        <%--                    </div>--%>
        <%--                </div>--%>
        <%--            </li>--%>
        <%--        </form:form>--%>
        <form:form method="post" modelAttribute="windowDTO" action="/konfigurator/okna-dachowe/podsumowanie">
            <li class="step active">
                <div data-step-label="Podsumowanie" class="step-title waves-effect waves-dark"></div>
                <form:hidden path="id"/>
                <div class="table-responsive text-nowrap">
                    <table class="table">
                        <thead>
                        <tr>
                            <th scope="col">Krok</th>
                            <th scope="col">Opis</th>
                            <th scope="col">Wybór</th>
                            <th scope="col">Edycja</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>Kąt montażu</td>
                            <td>${chosenMountingAngle.name}</td>
                            <td><a href='<c:url value="/konfigurator/okna-dachowe/krok-1/${id}"/>'>Edytuj</a></td>
                        </tr>
                        <tr>
                            <th scope="row">2</th>
                            <td>Materiał wykonania</td>
                            <td>${chosenMaterial.name}</td>
                            <td><a href='<c:url value="/konfigurator/okna-dachowe/krok-2/${id}"/>'>Edytuj</a></td>
                        </tr>
                        <tr>
                            <th scope="row">3</th>
                            <td>Typ otwierania</td>
                            <td>${chosenTypeOpening.name}</td>
                            <td><a href='<c:url value="/konfigurator/okna-dachowe/krok-3/${id}"/>'>Edytuj</a></td>
                        </tr>
                        <tr>
                            <th scope="row">4</th>
                            <td>Wymiary</td>
                            <td>${chosenWidth} x ${chosenHeight}</td>
                            <td><a href='<c:url value="/konfigurator/okna-dachowe/krok-4/${id}"/>'>Edytuj</a></td>
                        </tr>
                        <tr>
                            <th scope="row">5</th>
                            <td>Pakiet szybowy</td>
                            <td>${chosenGlazingType.name}</td>
                            <td><a href='<c:url value="/konfigurator/okna-dachowe/krok-5/${id}"/>'>Edytuj</a></td>
                        </tr>
                        <tr>
                            <th scope="row">6</th>
                            <td>Kolor zewnętrzny</td>
                            <td>${chosenMaterialColor.ralName}</td>
                            <td><a href='<c:url value="/konfigurator/okna-dachowe/krok-6/${id}"/>'>Edytuj</a></td>
                        </tr>
                        <tr>
                            <th scope="row">7</th>
                            <td>Klamka</td>
                            <td>${chosenHandle.type} - ${chosenHandle.color}</td>
                            <td><a href='<c:url value="/konfigurator/okna-dachowe/krok-7/${id}"/>'>Edytuj</a></td>
                        </tr>
                        <tr>
                            <th scope="row">8</th>
                            <td>Kołnierz uszczelniający</td>
                            <td>${chosenFlashing.typeName}</td>
                            <td><a href='<c:url value="/konfigurator/okna-dachowe/krok-8/${id}"/>'>Edytuj</a></td>
                        </tr>
                        <tr>
                            <th scope="row">9</th>
                            <td>Nawiewnik</td>
                            <td>${chosenVentilator.ventiName}</td>
                            <td><a href='<c:url value="/konfigurator/okna-dachowe/krok-9/${id}"/>'>Edytuj</a></td>
                        </tr>
                        <tr>
                            <th scope="row">10</th>
                            <td>Suma</td>
                            <td>Łączna kwota okna wyliczona z bazy danych</td>
                            <td>
                                <hidden value="${mainUrl}"></hidden>
                                <form:hidden path="id"/>
                                <form:hidden path="mountingAngleId"/>
                                <form:hidden path="materialId"/>
                                <form:hidden path="openingTypeId"/>
                                <form:hidden path="width"/>
                                <form:hidden path="height"/>
                                <form:hidden path="glazingTypeId"/>
                                <form:hidden path="materialColorId"/>
                                <form:hidden path="handleId"/>
                                <form:hidden path="flashingNameId"/>
                                <form:hidden path="ventilatorId"/>
                                <form:button type="submit" class="btn btn-primary">Zapisz</form:button>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </li>
        </form:form>
    </ul>
</main>

<jsp:include page="footer.jsp"/>
