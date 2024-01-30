function getValue() {
    var user = document.getElementById('user').value;
    var email = document.getElementById('email').value;
    var password = document.getElementById('password').value;
    var password2 = document.getElementById('password2').value;

    if (user != "" && email != "" && password != "" && password2 != "") {
        function validarEmail(email) {
            const regexEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            
            return regexEmail.test(email);
        }
        function validarSenha(senha) {
            const regexSenha = /^(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%^&*()_+])[A-Za-z\d!@#$%^&*()_+]+$/;
        
            return regexSenha.test(senha);
        }

        if (validarEmail(email)) {
            if (validarSenha(password)){
                if (password == password2){
                    fetch("http://localhost:8080/cadastro", 
                    {
                        headers: {
                            "Accept": "application/json",
                            "Content-Type": "application/json"
                        },
                        method: "POST",
                        body: JSON.stringify({
                            user: user,
                            email: email,
                            password: password,
                            password2: password2})
                    })
                    .then(function(res) {console.log(res)})
                    .catch(function(res) {console.log(res)});
    
                    console.log("User:", user); 
                    console.log("Email:", email);
                    console.log("Password:", password); 
                    console.log("Password2:", password2);
                } else {
                    alert("As senhas não são iguais");
                }
            } else {
                alert("A senha deve conter letra maiuscula, número e caracter especial.");
            }
            
        } else {
            alert("Senha ou Email inválido.");
            
        }

    }
    else {
        alert("Preencha todos os campos antes de continuar");
    }
}

