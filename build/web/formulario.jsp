<html>    
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet"href="estilos.css">
    </head>
    <body>
    <center>
        <h1>Registro de Profesores</h1>
    </center>

    <form name="f1" method="POST" action="Registrar" >
        <div id="RegistroProfesor">
            <h2>Registrate</h2>
            <br/>
            <div>
                <input type= "text" name= "documento" id = "documento" placeholder= "número de documento" required = "required"/>
            </div>

            <div>

                <input type= "text" name= "usuario" id = "usuario" placeholder= "usuario" required = "required"/>
            </div>

            <div>

                <input type= "password" name= "contrasena" id = "contrasena" placeholder= "contraseña" required = "required"/>
            </div>

            <div>

                <input type= "password" name= "vcontrasena" id = "vcontrasena" placeholder= "verificar contraseña" required = "required"/>
            </div>

            <div>
                <input type= "email" name= "correo" id = "correo" placeholder= "correo" required = "required"/>
            </div>

            <div>

                <select name ="perfil" style="width: 150px"> 
                    <option value = "0"> Seleccione un perfil </option>
                    <option value = "1"> Administrador </option>
                    <option value = "2"> Profesor </option>
                </select>
            </div>

            <div>

            </div>

            <div>

            </div>
            <center>

                <br/>
                <button type="submit" name="action" value="registrar"> Registrar </button>
                <button type="submit" name="action" value="limpiar"> limpiar </button>
            </center>
        </div>
    </form>
</body>
</html>
