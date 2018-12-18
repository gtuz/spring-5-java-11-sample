import React from "react";
import { connect } from "react-redux";

const mapStateToProps = state => {
  return { messages: state.messages };
};

const MessagesList = ({ messages }) => (
  <ul className="list-group list-group-flush">
    {messages.map(el => (
      <li className="list-group-item" key={el.id}>
        {el.content}
      </li>
    ))}
  </ul>
);

const App = connect(mapStateToProps)(MessagesList);
export default App;