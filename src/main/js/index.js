/**
 * Created by ethan on 04/02/17.
 */
import React from 'react';
import ReactDOM from 'react-dom';
import { StatusSearch } from './statussearch';
import { StatusUpdate } from './statusupdate';
import { AccountCreation } from './accountcreation';
import { Transaction } from './transaction';

ReactDOM.render(
    <div>
        <Transaction/>
    </div>, document.getElementById('statusFeed'));


