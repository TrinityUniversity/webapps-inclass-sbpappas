console.log("running react.js");

const ce = React.createElement

function StatelessHello(props){
  return ce('div', null, `Hello ${props.toWhat}`)
}

class Hello extends React.Component {

  constructor(props){
    super(props);
    this.state = { clickCount: 0 };
  }
    render() {
      return ce('div', {onClick: (e) => this.clickHandler(e)}, `Hello ${this.props.toWhat} - click count ${this.state.clickCount}` );
    }
    
    clickHandler(){
      this.setState({clickCount: this.state.clickCount +1});
    }
  }
  
  ReactDOM.render(
    ce('div', null, ce(StatelessHello, {toWhat: 'Web Apps'}), ce(Hello, {toWhat: 'Web Apps'}, null)),
    document.getElementById('react-root')
  );