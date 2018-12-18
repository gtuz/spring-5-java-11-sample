import { NEW_MESSAGE } from "../constants/action-types";

export const newMessage = message => ({ type: NEW_MESSAGE, payload: message });