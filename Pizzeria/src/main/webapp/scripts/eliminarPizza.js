function myFunction(data){
    
    value =  $(data).attr("data-id");
    
    //agregamos sweet alert
    Swal.fire({
        title: "Esta seguro de Eliminar la Pizza?",
        text: "La Pizza sera eliminado de la base!",
        icon: "warning",
        showCancelButton: true,
        confirmButtonColor: "#3085d6",
        cancelButtonColor: "#d33",
        confirmButtonText: "Yes, delete it!"
      }).then((result) => {
        if (result.isConfirmed) {
            //agregamos ajax
            $.ajax({
                type: "get",
                url: contextPath+"/PizzaEliminar?id="+value,
                dataType: "json",
                success: function (response) {
                    //agregamos sweet alert
                    Swal.fire({
                        title: "Eliminado!",
                        text: "El pizza se elimino correctamente.",
                        icon: "success"
                      });
                      //fin sweet alert

                    location.reload();
                }
            });
            //fin ajax
         
        }
      });





}