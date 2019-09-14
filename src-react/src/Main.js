import React, {Fragment} from 'react';
import Formulario from './Formulario';

class Main extends React.Component{

    constructor(){
        super();
        this.state = {
            contador: 0
        }
        
        this.aumentarContador = this.aumentarContador.bind(this);
    }


    aumentarContador(){
        this.setState({contador: this.state.contador + 1});
    }

    render(){
        return(
            //<Fragment>
            //   <p>Contador: {this.state.contador}</p>
            //    <button onClick={this.aumentarContador}>+</button>            
            //</Fragment>

            <Fragment>
                <Formulario/>

            </Fragment>
        );
    }
}

export default Main;