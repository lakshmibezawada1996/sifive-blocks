// See LICENSE for license details.
package sifive.blocks.devices.gpio

object GPIOCtrlRegs {
  val value       = 0x00
  val input_en    = 0x01
  val output_en   = 0x02
  val port        = 0x03
  val pullup_en   = 0x04
  val drive       = 0x05
  val rise_ie     = 0x06
  val rise_ip     = 0x07
  val fall_ie     = 0x08
  val fall_ip     = 0x09
  val high_ie     = 0x0a
  val high_ip     = 0x0b
  val low_ie      = 0x0c
  val low_ip      = 0x0d
  val iof_en      = 0x0e
  val iof_sel     = 0x0f
  val out_xor     = 0x10
  val passthru_high_ie = 0x11
  val passthru_low_ie  = 0x12
  val ps          = 0x13
  val poe         = 0x14
  val inputmask   =0x15
  val outputmask  =0x16    
}
