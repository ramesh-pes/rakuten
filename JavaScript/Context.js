import React, { Component } from 'react';
import {storeProducts, detailProduct} from './data';

const ProductContext = React.createContext();

// Provider
// Consumer

class ProductProvider extends Component {
    state = {
        products : [],
        cart: [],
        detailProduct: {},
        cartSubTotal : 0,
        cartTax : 0,
        cartTotal : 0
    }
    componentDidMount(){
         this.setProducts();
    }
    setProducts = () => {
        let prds = [];
        storeProducts.forEach(p => {
            let product = {...p};
            prds = [...prds,product];
        });

        this.setState({
            products: prds,
            detailProduct : detailProduct
        })
    }

    getItem =(id) => {
       let p = this.state.products.filter(prd => prd.id === id) [0];
       return p;
    }

    handleDetail = (id) => {
       console.log("detail " + id);
    }

    addToCart = (id) => {
        console.log("Add to Cart " + id);
    }

    increment = (id) => {
        
    }

    decrement = (id) => {
        
    }

    removeItem = (id) => {
    
    }

    clearCart = () => {
        
    }

    checkOut = () => {
       
    }
    addTotal = () => {
        let subTotal = 0.0;
        this.state.cart.map(item => {
            subTotal += item.total;
        }); 

        const tempTax = subTotal *0.1;
        const tax = parseFloat(tempTax.toFixed(2));
        const total = subTotal + tax ;
        this.setState(() => {
            return {
                cartSubTotal : subTotal,
                cartTax : tax,
                cartTotal : total
            }
        });
    }
    render() {
        return (
            <ProductContext.Provider value={{
                ...this.state,
                handleDetail: this.handleDetail,
                addToCart: this.addToCart,
                increment: this.increment,
                decrement: this.decrement,
                removeItem : this.removeItem,
                clearCart: this.clearCart,
                checkOut: this.checkOut
            }}>
                {this.props.children}                
            </ProductContext.Provider>
        );
    }
}


const ProductConsumer = ProductContext.Consumer;

export {ProductProvider, ProductConsumer};