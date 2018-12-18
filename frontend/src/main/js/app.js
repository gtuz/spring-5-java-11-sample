'use strict';

import React from "react";
import { render } from "react-dom";
import { Provider } from "react-redux";
import store from "./store/index";
import { connect } from "react-redux";
import App from "./components/App";
import { newMessage } from "./action/index"

window.store = store;
window.newMessage = newMessage;

render(
	<Provider store={store}>
        <App />
      </Provider>,
	document.getElementById('react')
)
