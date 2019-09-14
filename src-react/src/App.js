import React, {Fragment} from 'react';
import Header from './Header';
import Main from './Main';
import Footer from './Footer';

class App extends React.Component{

    constructor(){
        super();
        this.state = {
            links: ["perfil", "port", "contact"]
        }

    }

    render(){
        let {links} = this.state;
        return (
            <Fragment>
                <Header links={links}/>
                <Main/>
                <Footer/>
           </Fragment>
        )


    }

}

export default App;