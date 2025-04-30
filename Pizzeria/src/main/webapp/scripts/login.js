$(function() {
    $("#btn-login").click(function (e) {
        e.preventDefault(); 
        var usuario =$("#usuario").val();
        var contrasena =$("#contrasena").val();
            $.ajax({
                url: contextPath + '/ingresarUsuario',
                dataType: 'json',
                success: function (data) {
                    alert(data.mensaje   );
                    window.location.href=contextPath+'/home';
                },
                error: function(data) {
                    alert(data.responseJSON.mensaje);            
                },
                data: {
                    usuario: usuario,
                    contrasena: contrasena,
                },
                cache: true,
                type: 'post'
            });
    });


});