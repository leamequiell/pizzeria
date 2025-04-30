
$(function() {
    
    function cargarMesas() {
        $.ajax({
            type: "get",
            url: contextPath +'/mesas',
            data: "data",
            dataType: "json",
            success: function (response) {
                //agregamos la logica para agregar las mesas
                //iteramos la lista
                $.each(response, function(index,value){

                    $("#boxGroupMesas").append("");

                    
                    
                })
            }
        });
    }  


    function popularTablaPedidosEnSession() {
        
        $.ajax({
            type: "get",
            url: contextPath +'/pedidos',
            data: "data",
            dataType: "json",
            success: function (response) {
                //agregamos la logica para agregar las mesas
                //iteramos la lista
                populateTable(data);
            }
        });


    }

    function populateTable(data){
				
        $("#boxPedidosSolicitados tbody").find("tr:gt(0)").remove(); 

        $.each(data, function(i, v) {

          if (i == 0) {
            setDataOnRow($("#boxPedidosSolicitados tbody").find("tr").first(), v);

          } else {

            var clonnedRow = $($("#boxPedidosSolicitados tbody").find("tr").first()).clone();
            setDataOnRow(clonnedRow, v);

            $("#boxPedidosSolicitados tbody").append(clonnedRow);

          }
        });
            
    };
    
    function setDataOnRow(rowObject, v) {
      var identificador = v.identificador;
      var fecha = v.fecha;
      var direccion = v.direccion;
      var estado = v.estado;
      var telefono = v.telefono;
      var monto = v.monto;
      
      $(rowObject).find(".identificador").html(identificador);
      $(rowObject).find(".fecha").html(fecha);
      $(rowObject).find(".direccion").html(direccion);
      $(rowObject).find(".estado").html(estado);
      $(rowObject).find(".telefono").html(telefono);
      $(rowObject).find(".monto").html(monto);
      $(rowObject).find(".detalles").append( 
        $('<input/>').attr({
                        type: "button",
                        class :"btn btn-primary",
                        value: "Ver mas",
                        onclick: ""
                    })
        );
    }



    $(document).ready(function () {
        cargarMesas();
        popularTablaPedidosEnSession();

    });


});