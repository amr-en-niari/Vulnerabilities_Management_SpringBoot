
$('document').ready(function(){
    var password = document.getElementsByName("password")
    var confirmPassword = document.getElementsByName("confirmPassword");

    function validatePassword(){
        if(password.value != confirmPassword.value) {
            confirmPassword.setCustomValidity("Passwords Don't Match");
        } else {
            confirmPassword.setCustomValidity('');
        }
    }
    password.onchange = validatePassword;
    confirmPassword.onkeyup = validatePassword;
});