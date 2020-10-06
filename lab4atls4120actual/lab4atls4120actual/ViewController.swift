//
//  ViewController.swift
//  lab4atls4120actual
//
//  Created by alexa primiani on 10/5/20.
//  Copyright © 2020 alexa primiani. All rights reserved.
//

import UIKit

class ViewController: UIViewController, UITextFieldDelegate {

    @IBOutlet weak var weightAmount: UITextField!
    @IBOutlet weak var mOrfSelector: UISegmentedControl!
    @IBOutlet weak var drinkStepper: UIStepper!
    @IBOutlet weak var endBAC: UILabel!
    @IBOutlet weak var safeToDrive: UILabel!
    @IBOutlet weak var drinkLabel: UILabel!
    
    func textFieldShouldReturn(_ textField: UITextField) -> Bool {
        textField.resignFirstResponder()
        return true
    }
    
    @IBAction func updateDrinks(_ sender: UIStepper) {
        if drinkStepper.value == 1{
                   drinkLabel.text = "1 drink"
               }
               else{
                   drinkLabel.text = String(format: "%.0f", drinkStepper.value) + " drinks"
               }
            updateBAC()
           }
    
    func updateBAC(){
        
        var r:Float = 0.0
       
        if mOrfSelector.selectedSegmentIndex == 0{
            r = 0.68
        }
        if mOrfSelector.selectedSegmentIndex == 1{
            r = 0.55
        }
        
        var weight:Float
        
        if weightAmount.text!.isEmpty {
           weight = 0.0
        }
        else {
            weight = Float(weightAmount.text!)!
        }
        
        let numberOfDrinks = drinkStepper.value
        var alcGrams:Float
        var weightGrams:Float
        var calculatedBAC:Float = 0.0
        
        if numberOfDrinks > 0 {
            alcGrams = Float(numberOfDrinks * 14)
            weightGrams = weight * 453.59237
            calculatedBAC = (alcGrams/(weightGrams * r) * 100)
        }
        else{
            //this is some of the code from the tipCalculator example
            let alert=UIAlertController(title: "Error", message: "The number of drinks must be greater than 0", preferredStyle: UIAlertController.Style.alert)
            let okAction=UIAlertAction(title: "OK", style: UIAlertAction.Style.default, handler: {action in
                self.drinkStepper.value = 1
                self.drinkLabel.text? = "1 drink"
                self.updateBAC()
            })
            alert.addAction(okAction)
            present(alert, animated: true, completion: nil)
        }
    
        endBAC.text = "\(calculatedBAC)"
        
        if calculatedBAC > 0.08{
            safeToDrive.text = "no, don't drive"
        }
        else{
            safeToDrive.text = "yes, be safe"
        }
    }
    
    @IBAction func updateInfo(_ sender: UISegmentedControl) {
        updateBAC()
    }
    
    @IBAction func updateInfo2(_ sender: UITextField) {
        updateBAC()
    }
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        weightAmount.delegate=self
        // Do any additional setup after loading the view.
        
        // the code below is from chapter 7 of the textbook
        NotificationCenter.default.addObserver(self, selector: #selector(keyboardWillShow), name: UIResponder.keyboardWillShowNotification, object: nil)
               NotificationCenter.default.addObserver(self, selector: #selector(keyboardWillHide), name: UIResponder.keyboardWillHideNotification, object: nil)
               let tap: UITapGestureRecognizer = UITapGestureRecognizer(target: self, action: #selector(self.dismissKeyboard))
               view.addGestureRecognizer(tap)
           }
           @objc func dismissKeyboard() {
               view.endEditing(true)
           }
           @objc func keyboardWillShow(notification: NSNotification) {
               if let keyboardSize = (notification.userInfo?[UIResponder.keyboardFrameEndUserInfoKey] as? NSValue)?.cgRectValue {
                   if self.view.frame.origin.y == 0 {
                       //self.view.frame.origin.y -= keyboardSize.height
                   }
               }
           }
           @objc func keyboardWillHide(notification: NSNotification) {
               if ((notification.userInfo?[UIResponder.keyboardFrameEndUserInfoKey] as? NSValue)?.cgRectValue) != nil {
                   if self.view.frame.origin.y != 0 {
                       self.view.frame.origin.y = 0
                   }
               }
        
        
    }


}

