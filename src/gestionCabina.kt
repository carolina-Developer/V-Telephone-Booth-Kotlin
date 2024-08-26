class gestionCabina{

    var cabinas: MutableList<Cabina> = mutableListOf()

    //Constructor que inicializa la gestión de cabinas con una lista de cabinas.

    constructor(cabinas: MutableList<Cabina>){
        this.cabinas = cabinas
    }

    /**
     * Muestra un consolidado total de las llamadas realizadas en todas las cabinas gestionadas.
     * Calcula el número total de llamadas, la duración total de las llamadas, el costo total de las llamadas
     * y el costo promedio por minuto de las llamadas.
     */

    fun mostrarConsolidado() {
        var totalLlamadas = 0
        var duracionTotal = 0
        var costoTotal = 0

        // Suma los datos de todas las cabinas

        for (cabina in cabinas) {
            totalLlamadas += cabina.llamadas.size
            duracionTotal += cabina.duracion_total
            costoTotal += cabina.costo_total
        }

        // Calcula el costo promedio por minuto
        val costoPromedioPorMinuto = if (duracionTotal > 0) costoTotal / duracionTotal else 0

        // Muestra el consolidado total
        println("""
            
            **CONSOLIDADO TOTAL DE CABINAS
              Número total de llamadas: $totalLlamadas
              Duración total de las llamadas: $duracionTotal minutos
              Costo total de las llamadas: $costoTotal pesos
              Costo promedio por minuto: $costoPromedioPorMinuto pesos
        """.trimIndent())

    }

}