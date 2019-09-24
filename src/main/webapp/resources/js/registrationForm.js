$(function () {
    var context = window.location.pathname;

    function getAllCompanies() {
        return $.ajax({
            url: context + "rejestracja/",
            data: {},
            contentType: "application/json",
            method: "GET"
        }).done(function (result) {
            result.responseJSON;
            JSON.stringify(result);
        }).fail(function () {
            alert("Coś poszło nie tak spróbuje wczytać stronę ponownie")
        });
    }

    $('input[path="companyName"]').on('onblur', function (e) {
        e.preventDefault();
        var actualCompanyName = this.value();
        var data = getAllCompanies();
        var companies = data.valueOf().responseJSON;
        for (var i = 0; i < companies.length; i++) {
            if(companies[i].companyName === actualCompanyName){
                $('input[path="city"]').placeholder = companies[i].city;
                $('input[path="address"]').placeholder = companies[i].address;
                $('input[path="postCode"]').placeholder = companies[i].postCode;
                $('input[path="companyNip"]').placeholder = companies[i].companyNip;
                $('input[path="contactFirstName"]').placeholder = companies[i].contactFirstName;
                $('input[path="contactLastName"]').placeholder = companies[i].contactLastName;
            }
        }
    });
});