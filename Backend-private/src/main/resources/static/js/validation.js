document.querySelector('#num').addEventListener('blur', validateNum);

function validateNum(e) {
    const num= document.querySelector('#num');
    const re = /^([1-9]|10){1}$/;

    if (re.test(num.value)) {
        num.classList.remove('is-invalid');
        num.classList.add('is-valid');

        return true;
    } else {
        num.classList.add('is-invalid');
        num.classList.remove('is-valid');

        return false;
    }
}

function validatePreu(e) {
    const preu = document.querySelector('#preu');
    const re = /^[1-9]€$/;

    if (re.test(preu.value)) {
        preu.classList.remove('is-invalid');
        preu.classList.add('is-valid');

        return true;
    } else {
        preu.classList.add('is-invalid');
        preu.classList.remove('is-valid');

        return false;
    }
}

(function () {
    const forms = document.querySelectorAll('.needs-validation');

    for (let form of forms) {
        form.addEventListener(
            'submit',
            function (event) {
                if (
                    !form.checkValidity() ||
                    !validatePreu() ||
                    !validateNum()
                ) {
                    event.preventDefault();
                    event.stopPropagation();
                } else {
                    form.classList.add('was-validated');
                }
            },
            false
        );
    }
})();