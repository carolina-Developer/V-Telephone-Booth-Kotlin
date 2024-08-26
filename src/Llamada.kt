class Llamada (val tipo_llamada: TipoLlamada, val numero_destino:Long, val duracion:Int){

    /**
     * Costo total de la llamada, calculado como `tipo_llamada.costo_minuto * duracion`.
     */

    var costo_Llamada = tipo_llamada.costo_minuto * duracion

}