//
//  ViewController.swift
//  atls4120lab3
//
//  Created by alexa primiani on 9/23/20.
//  Copyright © 2020 alexa primiani. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var animalImage: UIImageView!
    @IBOutlet weak var titleLabel: UILabel!
    @IBOutlet weak var imageControl: UISegmentedControl!
    @IBOutlet weak var capitalSwitch: UISwitch!
    @IBOutlet weak var fontSizeLabel: UILabel!
    
    func updateImage(){
        if imageControl.selectedSegmentIndex == 0{
            titleLabel.text="here's a puppy"
            animalImage.image=UIImage(named: "puppyImage")
        }
        else if imageControl.selectedSegmentIndex == 1{
            titleLabel.text="here's a kitten"
            animalImage.image=UIImage(named: "kittenImage")
        }
    }
    
    func updateCaps(){
        if capitalSwitch.isOn {
            titleLabel.text=titleLabel.text?.uppercased()
        }
        else{
            titleLabel.text=titleLabel.text?.lowercased()
        }
    }
    
    
    @IBAction func changeInfo(_ sender: UISegmentedControl) {
        updateImage()
        updateCaps()
    }
    
    @IBAction func updateFont(_ sender: UISwitch) {
        updateCaps()
    }
    
    
    @IBAction func changeFontSize(_ sender: UISlider) {
        let fontSize=sender.value //float
        fontSizeLabel.text=String(format: "%.0f", fontSize)
        let fontSizeCGFloat=CGFloat(fontSize)
        titleLabel.font=UIFont.systemFont(ofSize: fontSizeCGFloat)
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

}

