class Cabina (var numeroCabina: Int) {

    var llamadas: MutableList<Llamada> = mutableListOf()
    var duracion_total : Int = 0
    var costo_total : Int = 0

    // Registra una nueva llamada en la cabina.
    //Agrega la llamada a la lista de llamadas de la cabina, actualiza la duración total y el costo total de las llamadas.

    fun registrarLlamada(tipo_llamada: TipoLlamada, numero_destino: Long, duracion: Int) {
        var llamada = Llamada(tipo_llamada, numero_destino, duracion)
        llamadas.add(llamada)
        duracion_total += llamada.duracion
        costo_total += llamada.costo_Llamada

        print("""
            
            **INFORMACION DE LA LLAMADA RECIENTE CON DESTINO A $numero_destino
            Cabina: $numeroCabina
            Tipo de llamada: ${llamada.tipo_llamada}
            Duración de la llamada: $duracion minutos
            Precio de la llamada: ${llamada.costo_Llamada}
            
        """.trimIndent())

    }
    // Muestra información general sobre la cabina.
    fun mostrarInformacionCabina(){
        println("""
            
            **INFORMACION GENERAL DE LA CABINA {$numeroCabina}
            Número de llamadas realizadas: ${llamadas.size}
            Duracion total llamadas: $duracion_total en minutos
            Costo total de llamadas $costo_total pesos
            
        """.trimIndent())

    }

    //Reinicia la cabina eliminando todas las llamadas registradas y restableciendo la duración y el costo total a cero.
    fun reiniciarCabina(){
        llamadas.clear()
        duracion_total = 0
        costo_total = 0
        println("""
            
            La cabina ${numeroCabina} ha sido reiniciada.
            
        """.trimIndent())
    }

}