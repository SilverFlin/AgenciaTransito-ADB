```mermaid
classDiagram




class Persona{
    -Long id
    -String RFC
    -String nombres
    -String apellidoPaterno
    -String apellidoMaterno
    -Date fechaNacimiento
    -String Telefono
    
    +setId(Long id):void
    +getId(): Long
    +setNombres(String nombres):void
    +getNombres(): String
    +setApellidoPaterno(String apellidoPaterno):void
    +getApellidoPaterno(): String
    +setApellidoMaterno(String apellidoMaterno):void
    +getApellidoMaterno(): String
    +setFechaNacimiento(Date fechaNacimiento):void
    +getFechaNacimiento(): Date
    +setTelefono(String telefono):void
    +getTelefono(): String

    +toString():String
    +equals(Object object):boolean
    +hashCode():int
}

class Tramites{
    -Long id
    -Double costo
    -Persona tramitante

    +setId(Long id):void
    +getId(): Long
    +setCosto(Double costo):void
    +getCosto(): Double
    +setTramitante(Persona tramitante):void
    +getTramitante(): Persona

    +toString():String
    +equals(Object object):boolean
    +hashCode():int
}

class Licencia{
    -Calendar fechaInicio
    -Calendar fechaCaducidad
    -Integer anhosVigencia
    -String Tipo

    +setFechaInicio(Calendar fechaInicio):void
    +getFechaInicio(): Calendar
    +setFechaCaducidad(Calendar fechaCaducidad):void
    +getFechaCaducidad(): Calendar
    +setAnhosVigencia(Integer id):void
    +getAnhosVigencia(): Integer
    +setTipo(String id):void
    +getTipo(): String

    +toString():String
    +equals(Object object):boolean
    +hashCode():int
}

class Placas{
    -String matricula
    -Date fechaEmision
    -Date fechaRecepcion
    -String tipo

    +setMatricula(String matricula):void
    +getMatricula(): String
    +setFechaEmision(Calendar fechaEmision):void
    +getFechaEmision(): Calendar
    +setFechaRecepcion(Calendar fechaRecepcion):void
    +getFechaRecepcion(): Calendar
    +setTipo(String id):void
    +getTipo(): String

    +toString():String
    +equals(Object object):boolean
    +hashCode():int
}

class Vehiculo{
    -Long id
    -Persona duenho
    -String numeroSerie
    -String linea
    -String marca
    -String modelo
    -String color
    -Placas placas

    +setId(Long id):void
    +getId(): Long
    +setNumeroSerie(String numeroSerie):void
    +getNumeroSerie(): String
    +setLinea(String linea):void
    +getLinea(): String
    +setMarca(String marca):void
    +getMarca(): String
    +setModelo(String modelo):void
    +getModelo(): String
    +setColor(String color):void
    +getColor(): String
    +setDuenho(Persona Duenho):void
    +getDuenho(): Persona
    +setPlacas(Placas placas):void
    +getPlacas(): Persona

    +toString():String
    +equals(Object object):boolean
    +hashCode():int
}

class Automovil

class Pago{
    -Long id
    -Date fechaPago
    -Double monto

    +setId(Long id):void
    +getId(): Long
    +setFechaPago(Date fechaPago):void
    +getFechaPago(): Date
    +setMonto(Double monto):void
    +getMonto(): Double
    
}

%% Relaciones
Vehiculo <|-- Automovil


Tramites <|-- Licencia
Tramites <|-- Placas

```