//
//  ViewController.swift
//  atls4120lab4
//
//  Created by alexa primiani on 9/24/20.
//  Copyright © 2020 alexa primiani. All rights reserved.
//

import UIKit

class ViewController: UIViewController, UITextFieldDelegate {
    @IBOutlet weak var heightAmount: UITextField!
    @IBOutlet weak var weightAmount: UITextField!
    @IBOutlet weak var drinkLabel: UILabel!
    @IBOutlet weak var drinkStepper: UIStepper!
    @IBOutlet weak var bacDo: UILabel!
    @IBOutlet weak var driveDo: UILabel!
    
    @IBAction func updateDrinks(_ sender: UIStepper) {
        if drinkStepper.value == 1{
            drinkLabel.text = "1 drink"
        }
        else{
            drinkLabel.text = String(format: "%.0f", drinkStepper.value) + " drinks"
        }
    }
    
    func textFieldShouldReturn(_ textField: UITextField) -> Bool {
        textField.resignFirstResponder()
        return true
    }
    
    func updateBAC(){
        var amount:Float
        
        if heightAmount.text!.isEmpty{
            amount = 0.0
        }
        else{
            amount = Float(heightAmount.text!)!
        }
        
        if weightAmount.text!.isEmpty{
                amount = 0.0
        }
        else{
                amount = Float(weightAmount.text!)!
               }
        
        let numberOfDrinks=drinkStepper.value
      
    }
    
   // func textFieldShouldReturn(_ textField: UITextField) -> Bool {
   //   textField.resignFirstResponder()
   // return true
   // }
    
    // add function that calculates BAC
    
    func textFieldDidEndEditing(_ textField: UITextField) {
        updateBAC()
    }
    
    // update if it is safe to drive
    
    
    override func viewDidLoad() {
        
        heightAmount.delegate=self
        weightAmount.delegate=self
        
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


}

